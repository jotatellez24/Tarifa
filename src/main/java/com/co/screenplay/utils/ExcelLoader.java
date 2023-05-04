package com.co.screenplay.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.co.screenplay.models.OportunidadMetodo;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLoader {
    /*
    public static void main(String[] args) throws Exception{
        readExcel(new File("D:\\Proyectos Intellij\\Tarifacion\\src\\test\\resources\\Data\\Sabana Tarifación Planes Cerrados.xlsx"));
    }
    */

    public static String SimpleDouble(Double d) {
        String v = String.format("%f", d);
        String _v = v.split(",")[0];
        return _v;
    }

    public static String completeDouble(Double d) {
        String v = String.format("%f", d);
        DecimalFormat df = new DecimalFormat("0.00");
        String resultado = df.format(d);
        return resultado;
    }
    public static ArrayList<OportunidadMetodo> readExcel(File file) throws Exception {
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rows][cols];
        for (int i = 1; i <= rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell cell = row.getCell(j);
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        data[i - 1][j] = cell.getStringCellValue();
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        data[i - 1][j] = cell.getNumericCellValue();
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        data[i - 1][j] = cell.getBooleanCellValue();
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        data[i - 1][j] = "";
                        break;

                }
            }
        }
        // workbook.close();
        inputStream.close();
        ArrayList<OportunidadMetodo> _l = new ArrayList<OportunidadMetodo>();
        for (int i = 0; i < data.length; i++) {
            _l.add(Mapper.OportunidadMapper(data[i]));
        }
        return _l;
    }

    public static void put(File file, List<OportunidadMetodo> estados) throws Exception {
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

    }

    public static void writeExcel(File file, List<OportunidadMetodo> ops) throws Exception {
        FileInputStream inputStream = new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        // Escribir datos
        for (int i = 0; i < ops.size(); i++) {
            sheet.getRow(i+1).createCell(21).setCellValue(ops.get(i).getEstado());
        }
        // Escribir archivo
        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        // Cerrar recursos
        outputStream.close();
        inputStream.close();
    }

}