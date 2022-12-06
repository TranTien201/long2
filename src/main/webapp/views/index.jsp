    <%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!doctype html>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html lang="vi">
    <head>
        <title>Title</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
                href="https://fonts.googleapis.com/css2?family=Poor+Story&family=Roboto:ital,wght@1,300;1,400;1,500&display=swap"
                rel="stylesheet">
        <!-- Bootstrap CSS v5.2.1 -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/style.css">
    </head>

<body>
<header>
    <div class="container">
        <h1 class="mt-3 text-center">BLOG</h1>
    </div>
</header>
<main>
    <section class="d-flex justify-content-center ">
        <div style="width: 95%;" >
            <hr>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item" style="background-color: #000; ">
                                <a class="nav-link active" aria-current="page" href="/" style="color: #fff">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="/about">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="/contact">Contact</a>
                            </li>
                            <c:set var = "userName" scope = "session" value = "${userName}"/>
                            <c:if test="${sessionScope.userName.equals('') || sessionScope.userName == null}"  >
                                <li class="nav-item">
                                    <a class="nav-link active" aria-current="page" href="/login">Login</a>
                                </li>
                            </c:if>
                            <c:if test="${sessionScope.userName != '' || sessionScope.userName != null}" >
                                <li class="nav-item">
                                    <a class="nav-link active" aria-current="page" href="/login/logout-user">Logout</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link active" aria-current="page" href="/user/${sessionScope.userName}">Hello ${sessionScope.userName}</a>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </section>
    <section class="d-flex justify-content-center mt-3">
        <div style="width: 95%;">
            <div class="row">
                <div class="col-8 border-end">
                    <div class="post">

                        <c:forEach var="post" items="${posts}">
                            <h3>${post.getTitle()}</h3>
                            <hr>
                            <p><span>posted by ${users.get(post.getAuthorID())}</span><span> Thời gian: ${post.getCreateTime()}</span></p>
                            <p>${post.getContent()}</p>
                            <div class="border border-secondary p-2">
                                <div>Tags: <span></span></div>
                                <div>
                                    <span style="text-decoration: underline">Comment (0) |</span>
                                    <span style="color: #ccc;">Thời gian update: ${post.getUpdateTime()}</span>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="col-4">
                    <div class="border border-secondary p-2">Tags</div>
                    <div class="p-2">
                        <c:forEach var="tag" items="${tags}">
                            <span>${tag.getNameTag()}</span>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </section>
</main>
<footer>
    <!-- place footer here -->
</footer>
<!-- Bootstrap JavaScript Libraries -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
        integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
</script>
</body>

</html>