describe('To view all product',()=> { 
	it('clicks view all product', () => {
		browser.waitForAngularEnabled(false);
		browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx');
		element(by.linkText ('View all products')).click();
		browser.getCurrentUrl().then((url) => {
            expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Products.aspx');})
		
		
	}); 



	}); 