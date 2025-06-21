package Programs;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ReadExcel {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\DCS\\Documents\\Testdata.xlsx"; // Path to your Excel file
        int rowIndex = 0;  // Row 0 (first row)
        int colIndex = 0;  // Column 0 (first column)

        readSingleCell(filePath, rowIndex, colIndex);
    }

    public static void readSingleCell(String filePath, int rowIndex, int colIndex) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Get first sheet
            Row row = sheet.getRow(rowIndex);

            if (row != null) {
                Cell cell = row.getCell(colIndex);

                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.println("Cell value: " + cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.println("Cell value: " + cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.println("Cell value: " + cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            System.out.println("Cell formula: " + cell.getCellFormula());
                            break;
                        default:
                            System.out.println("Cell is blank or of unknown type.");
                    }
                } else {
                    System.out.println("Cell not found.");
                }
            } else {
                System.out.println("Row not found.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
