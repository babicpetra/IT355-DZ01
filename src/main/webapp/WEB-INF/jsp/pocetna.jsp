
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Page Content -->
<div class="container">

    <%@include file="header.jsp" %>

    <div class="banner">
        <div class="carousel slide" id="myCarousel">
            <!-- Carousel items -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="<c:url value="/resources/img/Hazelnuts4.jpg"/>" alt="" class="bw">
                    <div class="carousel-caption">
                        <h1>Najveći izbor lešnika u Srbiji</h1>
                        <h2>Sve ponude i potražnje na jednom mestu</h2>
                    </div>
                </div>
                <div class="item">
                    <img src="<c:url value="/resources/img/Hazelnuts4.jpg"/>" alt="" class="bw">
                    <div class="carousel-caption">
                        <h1>Tražite lešnik za lične ili potrebe firme?</h1>
                        <h2>Postavite ono što tražite</h2>
                    </div>
                </div>
                <div class="item">
                    <img src="<c:url value="/resources/img/Hazelnuts4.jpg"/>" alt="" class="bw">
                    <div class="carousel-caption">
                        <h1>Nudite lešnik po najboljoj ceni?</h1>
                        <h2>Postavite ono što nudite</h2>
                    </div>
                </div>
            </div>
            <a data-slide="prev" href="#myCarousel" class="carousel-control left"><i class="fw-icon-chevron-left"></i></a>
            <a data-slide="next" href="#myCarousel" class="carousel-control right"><i class="fw-icon-chevron-right"></i></a>
        </div>
    </div>
</div>
<div class="container">
    <div class="featured-content">
        <div class="row-fluid">
            <div class="span5 offset1">
                <div class="block">

                    <h1>Imate određenu količinu lešnika koju želite da prodate?</h1>
                    <h2>Sve ponude koje imate možete da postavite nakon što se prijavite na naš sistem</h2>
                    <a href="/login" class="btn">prijavi se</a>
                </div>
            </div>
            <div class="span5">
                <div class="block-content">
                    <h3>Evo zašto bi trebalo da gajite lešnik!</h3>
                    <p> U zasadima lešnika prinos je svake godine sve veći, cena je uvek dobra, a kupci su zagarantovani. Zato, ukoliko imate malu površinu zemljišta, sigurno je da postoje razlozi da razmislite o gajenju ovog jezgrastog voća. Danas vam otkrivamo samo neke od prednosti sadnje lešnika, veoma neuobičajene voćarske kulture.
                    </p>
                    <p class="last">Suspendisse mauris. Fusce accumsan mollis eros. Pellentesque a diam sit amet mi ullamcorper vehicula. Integeralesuada.</p>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="featured-blocks">
        <div class="row-fluid">
            <div class="span4">
                <div class="media">
                    <a class="pull-left" href="#">
                        <i class="fw-icon-user icon"></i>
                    </a>
                    <div class="media-body">
                        <h1 class="media-heading">Sorte lešnika</h1>
                        <div class="ruler-bottom"></div>
                        <p class="spacing-t">Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue, euin vulputate magna eros lipsum</p>
                        <a href="http://www.zdravasrbija.com/lat/Zemlja/Vocarstvo/2120-SORTE-LESNIKA.php" class="btn">Pročitajte više</a>
                    </div>
                </div>
            </div>
            <div class="span4">
                <div class="media">
                    <a class="pull-left" href="#">
                        <i class="fw-icon-time icon"></i>
                    </a>
                    <div class="media-body">
                        <h1 class="media-heading">Koje sorte odabrati?</h1>
                        <div class="ruler-bottom"></div>
                        <p class="spacing-t">Craesent dapibus, neque id cursus faucibus, tortor neque egestas augue, euin vulputate magna eros lipsum</p>
                        <a href="http://www.poljomarket.rs/blog/292-koje-sorte-leske-odabrati" class="btn">Pročitajte više</a>
                    </div>
                </div>
            </div>
            <div class="span4">
                <div class="media">
                    <a class="pull-left" href="#">
                        <i class="fw-icon-tag icon"></i>
                    </a>
                    <div class="media-body">
                        <h1 class="media-heading">Mašine za obradu lešnika</h1>
                        <div class="ruler-bottom"></div>
                        <p class="spacing-t">Jraesent dapibus, neque id cursus faucibus, tortor neque egestas augue, euin vulputate magna eros lipsum</p>
                        <a href="https://www.halooglasi.com/poljoprivreda/mlinovi-krunjaci-prekrupaci/masine-za-obradu-lesnika/3967446" class="btn">Pročitajte više</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
                    <!--
<div class="container">
    <div class="featured-heading">
        <h1>Morbi in sem lorem placerat</h1>
        <h2>euismod in pharetra ultricies Crasconsequat vavimus sup</h2>
        <form class="form-horizontal input-append">
            <input class="span3" type="text" placeholder="cresent sbsum ...">cresent sbsum
            <button type="submit" class="btn">egeste</button>
        </form>
    </div>
</div>
<div class="container">
    <div class="tabs">
        <ul id="myTab" class="nav nav-tabs">
            <li class=""><a href="#Sedegestasteet" data-toggle="tab"><i class="fw-icon-flag"></i> Sed egest asteet</a></li>
            <li class=""><a href="#morbiinterdum" data-toggle="tab"><i class="fw-icon-tint"></i> morbi interdum</a></li>
            <li class="active"><a href="#interdumMorbi" data-toggle="tab"><i class="fw-icon-magnet"></i>interdum Morbi </a></li>
        </ul>
        <div id="myTabContent" class="tab-content">
            <div class="tab-pane fade active in" id="Sedegestasteet">
                <div class="row-fluid">
                    <div class="span6 ruler-right ruler-bottom">
                        <div class="block">
                            <img src="<c:url value="/resources/img/img1.png"/>" class="spacing-b"/>" alt="">
                            <p class="last">Sed egestas, ante et vulputate volutpat, eros pede semper est, vitae luctus metus libero eu augue. Morbi purus libero, faucibus adipiscing, commodo quis Gravida id, est. Sed lectus. Praesent elementum hendrerit tortor. Sed semper lorem at felis lorem ipsum dolor.</p>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="block no-spacing-l">
                            <img src="<c:url value="/resources/img/img2.png"/>" class="spacing-b no-spacing-l" alt="">
                            <p class="last">Sed egestas, ante et vulputate volutpat, eros pede semper est, vitae luctus metus libero eu augue. Morbi purus libero, faucibus adipiscing, commodo quis Gravida id, est. Sed lectus. Praesent elementum hendrerit tortor. Sed semper lorem at felis lorem ipsum dolor.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="tab-pane fade" id="morbiinterdum">
                <div class="row-fluid">
                    <div class="span6 ruler-right">
                        <div class="block">
                            <img src="img/img1.png" class="spacing-b" alt="">
                            <p class="last">Sed egestas, ante et vulputate volutpat, eros pede semper est, vitae luctus metus libero eu augue. Morbi purus libero, faucibus adipiscing, commodo quis Gravida id, est. Sed lectus. Praesent elementum hendrerit tortor. Sed semper lorem at felis lorem ipsum dolor.</p>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="block no-spacing-l">
                            <img src="img/img2.png" class="spacing-b no-spacing-l" alt="">
                            <p class="last">Sed egestas, ante et vulputate volutpat, eros pede semper est, vitae luctus metus libero eu augue. Morbi purus libero, faucibus adipiscing, commodo quis Gravida id, est. Sed lectus. Praesent elementum hendrerit tortor. Sed semper lorem at felis lorem ipsum dolor.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="tab-pane fade" id="interdumMorbi">
                <div class="row-fluid">
                    <div class="span6 ruler-right">
                        <div class="block">
                            <img src="img/img1.png" class="spacing-b" alt="">
                            <p class="last">Sed egestas, ante et vulputate volutpat, eros pede semper est, vitae luctus metus libero eu augue. Morbi purus libero, faucibus adipiscing, commodo quis Gravida id, est. Sed lectus. Praesent elementum hendrerit tortor. Sed semper lorem at felis lorem ipsum dolor.</p>
                        </div>
                    </div>
                    <div class="span6">
                        <div class="block no-spacing-l">
                            <img src="img/img2.png" class="spacing-b no-spacing-l" alt="">
                            <p class="last">Sed egestas, ante et vulputate volutpat, eros pede semper est, vitae luctus metus libero eu augue. Morbi purus libero, faucibus adipiscing, commodo quis Gravida id, est. Sed lectus. Praesent elementum hendrerit tortor. Sed semper lorem at felis lorem ipsum dolor.</p>
                        </div>
                    </div>
                </div>

            </div>


        </div>







    </div>
</div>-->
<div class="container">
    <div class="site-info">
        <div class="span3">
            <h1>Blog posts</h1>
            <div class="posts">
                <ul>
                    <li><img src="img/img3.png" class="pull-left" alt="">
                        Aug / 27 / 2013 <br>
                        <h6><a href="#">Cohn Doe</a></h6>
                        <p class="last">Praesent dapibus, neque id cursus faucibus, tortor ...</p>

                    </li>
                    <li><img src="img/img4.png" class="pull-left" alt="">
                        Aug / 27 / 2013 <br>
                        <h6><a href="#">Cohn Doe</a></h6>
                        <p class="last">Praesent dapibus, neque id cursus faucibus, tortor ...</p>

                    </li>
                    <li class="no-border-bottom"><img src="img/img5.png" class="pull-left" alt="">
                        Aug / 27 / 2013 <br>
                        <h6><a href="#">Cohn Doe</a></h6>
                        <p class="last">Praesent dapibus, neque id cursus faucibus, tortor ...</p>

                    </li>
                </ul>
            </div>
        </div>
        <div class="span3">
            <h1>Twitter posts</h1>
            <div class="posts">
                <ul>
                    <li class="no-border-bottom"><a href="#"><i class="fw-icon-twitter"></i></a>
                        <strong>@rafimit</strong> <br>
                        <p class="last">Morbi interdum mollis sapien sed ac risus. Phasellus lacinia</p>

                    </li>
                    <li class="no-border-bottom no-spacing-t"><a href="#"><i class="fw-icon-twitter"></i></a>
                        <strong>@johndoe</strong> <br>
                        <p class="last">Morbi interdum mollis sapien sed ac risus. Phasellus lacinia</p>
                    </li>
                    <li class="no-border-bottom no-spacing-t"><a href="#"><i class="fw-icon-twitter"></i></a>
                        <strong>@amanda</strong> <br>
                        <p class="last">Morbi interdum mollis sapien sed ac risus. Phasellus lacinia</p>
                    </li>
                    <li class="no-border-bottom no-spacing-t"><a href="#"><i class="fw-icon-twitter"></i></a>
                        <strong>@peter</strong> <br>
                        <p class="last">Morbi interdum mollis sapien sed ac risus. Phasellus lacinia</p>
                    </li>
                </ul>
            </div>
        </div>
        <div class="span5">
            <h1>Quick contact</h1>
            <img src="img/img6.png" class="spacing-t spacing-b" alt="">
            <div class="site-address">
                <strong>Address</strong><br>
                <span>Building name, some street name, some city name, country</span>
            </div>
            <a href="#" class="link"> info@sitename.com </a> /  (000)  888 888 8888

        </div>
    </div>
</div>


<script src="<c:url value="/resources/js/jquery-1.9.1.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/resources/js/bootstrap.js"/>" type="text/javascript"></script>
<script>
    $('#myCarousel').carousel({
        interval: 1800
    });
</script>