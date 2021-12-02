describe('To edit orders',()=> { 
	it('Edit orders', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(by.xpath("/html/body/form/table/tbody/tr/td[2]/div[2]/div[3]/table/tbody/tr[2]/td[13]/input")).click();
		element(by.id('ctl00_MainContent_fmwOrder_ddlProduct')).click();
		element(by.xpath('/html/body/form/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/ol[1]/li[1]/select/option[2]')).click();
		element(by.id('ctl00_MainContent_fmwOrder_txtQuantity')).clear();
		element(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("3");
		element(By.className("btn_dark")).click();
		element(by.id('ctl00_MainContent_fmwOrder_UpdateButton')).click();
        browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');})
		



	}); 

});