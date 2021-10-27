package utils.excelutils;

import java.io.File;
import java.io.FileInputStream;
<<<<<<< HEAD

=======
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
>>>>>>> 679d41e0f93262665e7e972b65918215e554598e
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
