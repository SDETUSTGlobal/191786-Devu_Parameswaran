describe('To view all orders',()=> { 
	it('clicks check  all orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(By.id("ctl00_MainContent_btnCheckAll")).click(); 	
	}); 

	it('clicks uncheck  all orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(By.id("ctl00_MainContent_btnUncheckAll")).click();
		
	}); 

	it('clicks  Delete orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
		element(By.name("ctl00$MainContent$btnDelete")).click();	
	}); 


	it('Edit orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(By.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[13]/input")).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');})
		


		
	}); 


});