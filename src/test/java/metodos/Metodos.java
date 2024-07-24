package metodos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	/**
	 * Metodos para escrever em um elemento Web passando o By e String
	 * 
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	/**
	 * Metodo para clicar em um elemento web usando um By
	 * 
	 * @param elemento
	 */
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	/**
	 * Metodos para aguardar um elemento ficar visivel na tela até 10 segundos antes
	 * do timeout
	 * 
	 * @param elemento
	 */
	public void aguardarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	}

	/**
	 * Pausar aplicação por tempo determinado na execução do método
	 * 
	 * @param time
	 */
	public void pausa(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo para evidenciar a execução do teste
	 * 
	 * @param nomeEvidencia
	 */
	public void evidencia(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo para fazer upload do arquivo passando o caminho e nome do arquivo
	 * 
	 * @param path
	 * @param time
	 */
	public void upload(String path, int time) {
		try {
			Robot robot = new Robot();
			StringSelection ss = new StringSelection("C:\\Users\\laris\\Downloads\\rg.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000);

		} catch (AWTException e) {
			e.printStackTrace();
		}

	}
}
