### HTTP: Stateful or stateless?
Please demonstrate the answer to this question by making the necessary changes to the web module.

**Due date:** 3 Aug 2015

### Persisting state on client side
Implement simple shopping cart.

The application will consist of 2 screens: "Products" (simple table with product names and "Buy" links, "Check out" submit button) and "Order Confirmation" (appears after user has pressed "Check out" button on the previous screen; displays contents of the shopping cart).

**Due date:** 10 Aug 2015

##### NOTES
Please create & load cookies on client side (JS).

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

**Due date:** 3 Aug 2015

##### Questions
1. What other ways (even practically unsuitable) of implementing authentication do you know?
2. **Please demonstrate what is JSESSIONID using the developed application. Explain why it's needed and how it's used.**
3. What is an HttpSession? When is it created? What is the scope of a session? Which object is it related to in a servlet container?
4. Imagine we created a session in MyServlet. Will this session be visible in HomeServlet inside of the same web app? In AuthServlet inside of another web app (same servlet container)? In any servlet outside of that container?
5. In the developed app, can you use HttpRequest instead of HttpSession?

### Concluding Questions

**Please write down your answers here under "A" mark and be prepared to answer them at our 1:1 as well.**

**Due date:** August 31, 2015

**Q:** When exactly is an HTTP session created?  
**A:**

**Q:** What is the format of an HTTP response?  
**A:**

**Q:** How can the server set a cookie?  
**A:**

**Q:** How does request.getSession() work internally? (Please have a look at its source code.)  
**A:**

**Q:** How does it know that there is already a session associated with that particular client?  
**A:**
