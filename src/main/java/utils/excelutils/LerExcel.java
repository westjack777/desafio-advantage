package utils.excelutils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LerExcel {

	public static void main(String[] args) throws Exception {

		File src = new File("src/main/java/utils/excelutils/dados.xlsx");
		FileInputStream arquivo = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(arquivo);
		XSSFSheet planilha = wb.getSheetAt(0);

		int qtdeLinhas = planilha.getLastRowNum();

		for (int i = 0; i < qtdeLinhas; i++) {

		}
		wb.close();
	}

}
