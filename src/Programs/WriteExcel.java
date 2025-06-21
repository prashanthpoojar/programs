package Programs;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    public static void main(String[] args) {
        String fileName = "mysheet.xlsx";

        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();
        
        // Create a sheet
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create a row (index 0 = first row)
        Row row = sheet.createRow(0);

        // Create a cell (index 0 = column A)
        Cell cell = row.createCell(0);

        // Set value to the cell
        cell.setCellValue("Hello Excel!");

        // Save the Excel file
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            workbook.write(fos);
            workbook.close();
            System.out.println("Data written to single cell in " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
