// spec.ts
const {element} = require {"protractor"};
describe('Protractor Demo',()=> { 
	it('Demo', () => { 
		browser.get('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx') 
		//element(by.name('basic-usage')).click();
		element(by.id('ctl00_MainContent_username')).sendKeys('Tester');
		element(by.id('ctl00_MainContent_password')).sendKeys('test');
		element(by.name('ctl00$MainContent$login_button')).click();
		const name = element(by.xpath('/html/head/title')).getAttribute("title");
		expect(name).toBe("Web Orders Login"); 
	}); 
});