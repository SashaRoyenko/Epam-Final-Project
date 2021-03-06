<%--
  Created by IntelliJ IDEA.
  User: Sasha
  Date: 29.05.2019
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value="${locale}"/>
<fmt:setBundle basename="${bundle}"/>

<html lang="${locale}">
<head>
    <jsp:include page="parts/link.jsp"/>
    <title><fmt:message key="label.home.title"/></title>
</head>
<body>
<jsp:include page="parts/nav.jsp"/>
<section class="home-slider owl-carousel">
    <div class="slider-item" style="background-image: url('${pageContext.request.contextPath}/images/bg_1.jpg');">
        <div class="overlay"></div>
        <div class="container">
            <div class="row slider-text align-items-center justify-content-center text-center">
                <div class="col-md-10 col-sm-12 ftco-animate">
                    <h1 class="mb-3"><fmt:message key="label.home.slide1"/></h1>
                    <p><a href="${pageContext.request.contextPath}/tasty-restaurant/registration" class="btn btn-primary btn-outline-white px-5 py-3">
                        <fmt:message key="label.registration.title"/></a>
                    </p>
                </div>
            </div>
        </div>
    </div>

    <div class="slider-item" style="background-image: url('${pageContext.request.contextPath}/images/bg_2.jpg');">
        <div class="overlay"></div>
        <div class="container">
            <div class="row slider-text align-items-center justify-content-center text-center">
                <div class="col-md-10 col-sm-12 ftco-animate">
                    <h1 class="mb-3"><fmt:message key="label.home.slide2"/></h1>
                    </p>
                </div>
            </div>
        </div>
    </div>

    <div class="slider-item" style="background-image: url('${pageContext.request.contextPath}/images/bg_3.jpg');">
        <div class="overlay"></div>
        <div class="container">
            <div class="row slider-text align-items-center justify-content-center text-center">
                <div class="col-md-10 col-sm-12 ftco-animate">
                    <h1 class="mb-3"><fmt:message key="label.home.slide3"/></h1></p>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- END slider -->

<section class="ftco-section-2">
    <div class="container d-flex">
        <div class="section-2-blocks-wrapper row">
            <div class="img col-sm-12 col-lg-6" style="background-image: url('${pageContext.request.contextPath}/images/about-2.jpg');">
            </div>
            <div class="text col-lg-6 ftco-animate">
                <div class="text-inner align-self-start">
                    <span class="subheading"><fmt:message key="label.home.about.title"/></span>
                    <h3 class="heading"><fmt:message key="label.home.about.heading"/></h3>
                    <p><fmt:message key="label.home.about.content1"/></p>
                    <p><fmt:message key="label.home.about.content2"/></p>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="parts/footer.jsp"/>
