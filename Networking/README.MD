# Chapter 1. HTTP: Persisting state

### HTTP: Stateful or stateless?

**Due date:** 3 Aug 2015

### Persisting state on client side

https://github.com/sdonchenko/IdpTask

The application will consist of 2 screens: "Products" (simple table with product names and "Buy" links, "Check out" submit button) and "Order Confirmation" (appears after user has pressed "Check out" button on the previous screen; displays contents of the shopping cart).

**Due date:** 10 Aug 2015

### Persisting state on both server and client side

https://github.com/sdonchenko/IdpTask

Enhance previously developed application with new functionality: Add "Login" screen (initial) and "Logout" link (present on every screen except "Login").

##### Acceptance Criteria

https://github.com/sdonchenko/IdpTask

1. Redirect to "Login" screen whenever the user is discovered to be anonymous.
2. Go to "Home" screen (list of products) if user entered "sergii" as login and "sdonch$2015" as password (both can be hardcoded wherever convenient). Stay on "Login" page otherwise.
3. If user pressed "Logout" link, consider the user anonymous and redirect to "Login" screen.

**Due date:** 3 Aug 2015

### Concluding Questions

**Q:** When exactly is an HTTP session created?  
**A:** A HttpSession is created when calling request.getSession() or request.getSession(true). JSP by default automatically create a session. This behaviour can be disabled by using: <%@ page session="false">

**Q:** What is the format of an HTTP response?  
**A:** Response: 
- Status line;
- General headers;
- Response headers;
- Entity headers;
- Message body (optionally);

**Q:** How can the server set a cookie?  
**A:** A cookie that is set by the server, will be sent to the client in a response. The server only sends the cookie when it is explicitly set or changed, while the client sends the cookie on each request.
```java
String headerName=null;
for (int i=1; (headerName = uc.getHeaderFieldKey(i))!=null; i++) {
 	if (headerName.equals("Set-Cookie")) {                  
	String cookie = urlConn.getHeaderField(i);               
	...   
```
**Q:** How does request.getSession() work internally? (Please have a look at its source code.)  
**A:** 
```java     
    /**
     * Returns the current <code>HttpSession</code> associated with this
     * request or, if there is no current session and <code>create</code> is
     * true, returns a new session.
     *
     * <p>If <code>create</code> is <code>false</code> and the request has no
     * valid <code>HttpSession</code>, this method returns <code>null</code>.
     *
     * <p>To make sure the session is properly maintained, you must call this
     * method before the response is committed. If the container is using cookies
     * to maintain session integrity and is asked to create a new session
     * when the response is committed, an IllegalStateException is thrown.
     *
     * @param create <code>true</code> to create a new session for this request
     * if necessary; <code>false</code> to return <code>null</code> if there's
     * no current session
     *
     * @return the <code>HttpSession</code> associated with this request or
     * <code>null</code> if <code>create</code> is <code>false</code> and the
     * request has no valid session
     *
     * @see #getSession()
     */
```
**Q:** How does it know that there is already a session associated with that particular client?  
**A:** 
![alt tag](http://machinesaredigging.com/blog-mad/wp-content/uploads/2013/10/how_does_a_session_work-1024x724.jpg)

**Due date:** August 31, 2015

# Chapter 2. Architecture

### REST

**Due date:** Sep 7, 2015

##### Questions

1. What is REST?
2. What are the alternatives? For one of the named technologies, explain how it differs from REST.
3. Is your "Shopping Cart" application RESTful? Why? Which aspects of it need to be revised to comply?
4. What is called the RESTful API? Give an example. RESTful API Implementation?

**A:**
1. Client-server technology
2. Without state
3. Cache
4. Multi-stage system
5. Code request (optional)
6. Single interface

2. SOAP.
3. Nope.
4. RESTful API is a simple Web service implemented using HTTP and REST principles. Twitter api.

# Chapter 3. Frameworks and Libraries

### JAX-RS and Jersey
1. Please read recommended literature and answer the questions below
2. Implement the task

**Due date:** Oct 2, 2015
