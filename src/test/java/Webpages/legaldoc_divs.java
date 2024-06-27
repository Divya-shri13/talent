package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import generic.BaSeClass;

public class legaldoc_divs extends BaSeClass {
	WebDriver driver;

	public legaldoc_divs(WebDriver driver) {
		this.driver = driver;
	}

	By doc = By.xpath("//a[@class='document active']");
	By offer = By.xpath("//a[text()='Offer Letter for Employment']");
	By text = By.xpath("//div[@class=\"document-title\"]/h1");
	By fill = By.xpath("(//a[text()[normalize-space()='Fill out the template']])[1]");
	By datefield = By.xpath("//input[@placeholder=\"dd-mm-yyyy\"]");
	By date = By.xpath("(//a[@class='ui-state-default'])[20]");
	By nmemployerr = By.xpath("//input[@name='bus_name']");
	By submit = By.xpath("//button[@type='submit']");
	By submit1 = By.xpath("(//button[@type='submit'])[1]");
	By empname1 = By.xpath("//input[@name='emp_firstname']");
	By radio1 = By.xpath("//div[@class=\"radio_box_texte\"]");// sb
	By company = By.xpath("//input[@name='comp_name']");
	By progess = By.xpath("//div[@class='pourcentage']");
	By radio2 = By.xpath("//div[@class='radio_box_texte active']");
	By empctadd = By.xpath("//textarea[@name='emp_address']");
	By duty = By.xpath("//textarea[@name='duties_list']");
	By emppre = By.xpath(" business premises of the employer");
	By add = By.xpath("//textarea[@name='location_work']");
	By no = By.xpath("//div[@class=\"radio_box_texte\"]");
	By termination = By.xpath("//input[@name='notice_period']");
	By finish = By.xpath("(//button[@type='submit'])[1]");
	By comp = By.id("texte_bouton_commander");
	By error = By.id("email_message_erreur_champ");

	public void legal() throws InterruptedException {
		WebElement document = driver.findElement(doc);
		ClickMethods(document);
		WebElement off = driver.findElement(offer);
		ClickMethods(off);
		WebElement txt = driver.findElement(text);
		System.out.println(txt.getText());
		WebElement fil = driver.findElement(fill);
		ClickMethods(fil);
		WebElement dtfil = driver.findElement(datefield);
		ClickMethods(dtfil);
		WebElement dt = driver.findElement(date);
		ClickMethods(dt);
		WebElement nmemp = driver.findElement(nmemployerr);
		SendkeysMethod(nmemp, "Divya");
		WebElement sb1 = driver.findElement(submit);
		ClickMethods(sb1);
		// driver.navigate().refresh();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement rd1 = driver.findElement(radio1);
		ClickMethods(rd1);
		WebElement sub2 = driver.findElement(submit1);
	//	waits(driver, 3, submit1);
		ClickMethods(sub2);
		Thread.sleep(5000);
		// driver.navigate().refresh();
		WebElement nameemp = driver.findElement(empname1);
		Thread.sleep(5000);
		try {
			SendkeysMethod(nameemp, "sfghdx");
			Thread.sleep(3000);
		} catch (StaleElementReferenceException e) {
		}

		WebElement sub3 = driver.findElement(submit1);
		ClickMethods(sub3);
//		WebElement cmpny = driver.findElement(company);
//		SendkeysMethod(cmpny,"adta#@WETYyt");
		WebElement prg = driver.findElement(progess);
		System.out.println(prg.getText());
//	WebElement rd3 = driver.findElement(radio2);
//	ClickMethods(rd3);
		// What is the new employee's contact address?

		Thread.sleep(5000);
		WebElement addct = driver.findElement(empctadd);
		SendkeysMethod(addct, "siufgjkhidhnm");
		Thread.sleep(5000);
		WebElement sb4 = driver.findElement(submit1);
		ClickMethods(sb4);
		Thread.sleep(5000);
		WebElement rd3 = driver.findElement(radio2);
		ClickMethods(rd3);
		WebElement sb5 = driver.findElement(submit1);
		ClickMethods(sb5);
		Thread.sleep(5000);
//major tasks
		WebElement listtdt = driver.findElement(duty);
		SendkeysMethod(listtdt, "resfdxyhgiuh@#$%$");
		WebElement sb6 = driver.findElement(submit1);
		ClickMethods(sb6);
		Thread.sleep(5000);
// business premises of the employer
		WebElement preemp = driver.findElement(emppre);
		ClickMethods(preemp);
		WebElement sb7 = driver.findElement(submit1);
		ClickMethods(sb7);
		Thread.sleep(5000);
		// new employee will be required
		WebElement req = driver.findElement(add);
		SendkeysMethod(req, "rtdfij;ollk324576jvgclk");
		WebElement sb8 = driver.findElement(submit1);
		ClickMethods(sb8);
		Thread.sleep(5000);
		// Probationary Period
		WebElement per = driver.findElement(no);
		ClickMethods(per);
		WebElement sb9 = driver.findElement(submit1);
		ClickMethods(sb9);
		Thread.sleep(5000);
		// new employee's probationary period
		Select select = new Select(driver.findElement(By.id("prob_period")));
		select.selectByValue("one month");
		WebElement sb10 = driver.findElement(submit1);
		ClickMethods(sb10);
		Thread.sleep(5000);
		// again click
		WebElement sb11 = driver.findElement(submit1);
		ClickMethods(sb11);
		Thread.sleep(5000);
		// salary be paid to the employee
		Select select1 = new Select(driver.findElement(By.id("mannerpayment")));
		select1.selectByValue("one month");
		WebElement sb14 = driver.findElement(submit1);
		ClickMethods(sb14);
		Thread.sleep(5000);
		// salary be paid to the employee
		WebElement sb12 = driver.findElement(submit1);
		ClickMethods(sb12);
		Thread.sleep(5000);
		// termination of employee or by the employee in case of resignation
		WebElement ter = driver.findElement(termination);
		ClickMethods(ter);
		WebElement sb13 = driver.findElement(submit1);
		ClickMethods(sb13);
		Thread.sleep(5000);
		// finish
		WebElement fn = driver.findElement(finish);
		ClickMethods(fn);
		// complete
		WebElement cpm = driver.findElement(comp);
		ClickMethods(cpm);
		// error mss
		WebElement err = driver.findElement(error);
		err.getText();

	}

}
