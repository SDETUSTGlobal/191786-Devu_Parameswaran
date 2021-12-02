describe('To order product',()=> { 
    it('Order products', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element (by.linkText ('Order')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx');})

		element(by.id('ctl00_MainContent_fmwOrder_ddlProduct')).click();
		element(by.xpath('/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[1]/select/option[3]')).click();
	   
	    element(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("10");
        element(By.id("ctl00_MainContent_fmwOrder_txtUnitPrice")).sendKeys("80");
		element(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[5]/input[2]")).click();
		element(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("Devu");
		element(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("abc");
        element(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Ekm");
        element(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Kerala");
		element(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("000000");
		element(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		element(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("67899");
	    element(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/23");
		element(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/a")).click();
		
		
	}); 



	}); 
