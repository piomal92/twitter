<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 23.08.2020
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <jsp:include page="include/meta.jsp"/>
    <title>SDA Twitter lista artykułów</title>
    <meta name="description" content="Lista artykułów"/>
    <meta name="keyword" content="Lista, artykuł, sda, twitter"/>

</head>
<body>
<jsp:include page="include/header.jsp"/>

<main role="main">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">Hello, world!</h1>
            <p>This is a template for a simple marketing or informational website. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p>
        </div>
    </div>

    <div class="container">
        <!-- Example row of columns -->
        <div class="row">
            <div>
                <h2>Heading</h2>
                <p>Przykładowy tekst artykułu </p>
                <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div>
        </div>

        <hr>

    </div> <!-- /container -->

</main>
<jsp:include page="include/footer.jsp"/>
</html>

