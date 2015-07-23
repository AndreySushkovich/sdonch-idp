### HTTP: Stateful or stateless?
Please demonstrate the answer to this question by making the necessary changes to the web module.

### Persisting state on client side
Implement simple shopping cart.

The application will consist of 2 screens: "Products" (simple table with product names and "Buy" links, "Check out" submit button) and "Order Confirmation" (appears after user has pressed "Check out" button on the previous screen; displays contents of the shopping cart).

##### NOTES
State is to be persisted on the client side. jQuery is prohibited (pure JavaScript without any frameworks).

##### Hint
Use cookies for storing state on "Products" page and loading it on "Order Confirmation."

##### Questions
1. How would you send the information about selected products to server?


### Persisting state on both server and client side
Implement basic authentication mechanism.

Enhance previously developed application with new functionality: Add "Login" screen (initial) and "Logout" link (present on every screen except "Login").

##### Acceptance Criteria
1. Redirect to "Login" screen whenever the user is discovered to be anonymous.
2. Go to "Home" screen (list of products) if user entered "sergii" as login and "sdonch$2015" as password (both can be hardcoded wherever convenient). Stay on "Login" page otherwise.
3. If user pressed "Logout" link, consider the user anonymous and redirect to "Login" screen.

##### NOTES
Don't use any third-party security frameworks, nor servlet filters.

##### Hint
Use HttpSession for storing credentials. Check them on server side each time user opens any page. 

##### Questions
1. What other ways (even practically unsuitable) of implementing authentication do you know?
2. **Please demonstrate what is JSESSIONID using the developed application. Explain why it's needed and how it's used.**
