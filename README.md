# TestAutomation
This project is a complete automation test framework to test a demo E-Commerce web application completely coded in core java using Eclipse. 

# Explanation of classes
The project contains prerequisites class as the before suite where running it opens the chrome browser and navigates to the given url in the code.
Login.java extends the Prerequisites.java and logs in the user to the application.
In BrowseProduct.java the test will happen to browse the desired product given as input in the code and checks if it is available or not.
If the desired product is available the product will get added to the cart in AddToCart.java. if it is not available, a message is shown that it has failed to add the product to the cart.
Once the product is added to cart, it will perform the checkout procedure in checkout.java file.
After the checkout is done, it will run aftersuite code where it logs out of the webpage and closes the browser.

# Requirements
The user needs to have eclipse IDE, selenium and TestNG plugin in order to run the project one class by another as a suite and get the test results.
