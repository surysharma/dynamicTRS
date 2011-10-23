<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="dtrs.css" />
    <title>Create Candidate</title>
</head>
<body>
    <p>Dynamic TRS Create Candidate</p>
    <form:form action="" method="POST" commandName="candidate">
    <form:label path="">Candidate First Name</form:label>
     <form:input path="candidateFirstName"/>
       <br/>
      <form:label path="">Candidate Middle name</form:label>
     <form:input path="candidateMiddleName"/>
           <br/>
     <form:label path="">Candidate Last name</form:label>
     <form:input path="candidateLastName"/>
             <br/>

       <input type="submit" value="Enter" />


        <!--
            private String candidateFirstName;
    private String candidateMiddleName;
    private String candidateLastName;
        -->
    </form:form>

</body>
</html>