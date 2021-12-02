describe('Login',()=> { 
	it('Sample', () => { 
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');})
	}); 
	it('Should accept the user login credentials and login', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');
		element(by.id("ctl00_MainContent_username")).sendKeys("Tester");
		element(By.name("ctl00$MainContent$password")).sendKeys("test");
	    element(By.className("button")).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');})
		
	 });
});