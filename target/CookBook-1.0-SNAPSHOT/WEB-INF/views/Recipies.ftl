<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
     <link rel="stylesheet" href="../css/media.css">
    <link rel="stylesheet" href="../css/normalize.css">
    <link rel="stylesheet" href="../css/fonts.css">
    <link rel="stylesheet" href="../css/jquery.rateyo.min.css">
    <link rel="stylesheet" href="../css/multiple-select.min.css">
    <link rel="stylesheet" href="../css/slick.css">
    <link rel="stylesheet" href="../css/style.css">

</head>

<body>

<header class="header_section">

    <div class="header__top">
        <div class="container">
            <div class="header__contacts">
                <a href="#" class="header__text">Hello, dear visitor!</a>
                <a href="#" id="facebook" class="header__links"></a>
                <a href="#" id="twitter" class="header__links"></a>
                <a href="#" id="pinterest" class="header__links"></a>
                <a href="#" id="linkedIn" class="header__links"></a>
                <a href="#" id="mail" class="header__links"></a>
            </div>
        </div>
    </div>
    <div class="header__content">
            <span class="toggle-button">
                <div class="menu-bar menu-bar-top"></div>
                <div class="menu-bar menu-bar-middle"></div>
                <div class="menu-bar menu-bar-bottom"></div>
            </span>

        <div class="container">
            <div class="header__content-inner">
                <div class="header__logo">
                    <a href="/CookBook_war/">
                        <img src="../img/logos.png" alt="logo">
                    </a>
                </div>

                <div class="menu-wrap">
                    <div class="menu-sidebar">
                        <div class="mob__logo">
                            <a href="/CookBook_war/">
                                <img src="img/logos.png" alt="logo">
                            </a>
                        </div>
                        <ul class="mob__menu">
                            <li><a href="/CookBook_war/">Home</a></li>
                            <li><a href="/CookBook_war/about/aboutUs">About us</a></li>
                            <li><a href="/CookBook_war/recipes/recipies">Receipies</a></li>
                            <li><a href="/CookBook_war/recipes/vegans">4 Vegans</a></li>
                            <li><a href="/CookBook_war/contact/contactUs">Contact</a></li>
                        </ul>
                    </div>
                </div>
                <nav class="menu">
                    <ul>
                        <li><a href="/CookBook_war/">Home</a></li>
                        <li><a href="/CookBook_war/about/aboutUs">About us</a></li>
                        <li><a href="/CookBook_war/recipes/recipies">Receipies</a></li>
                        <li><a href="/CookBook_war/recipes/vegans">4 Vegans</a></li>
                        <li><a href="/CookBook_war/contact/contactUs">Contact</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <div class="contact-logo">
        <div class="layer"></div>
        <div class="contact-text">
            Recipies
        </div>
    </div>
</header>

<section class="find__receipies">
    <div class="container">
        <div class="find__inner">
            <form action="/CookBook_war/recipes/findbyNameAndTypes" method="post">
                <input name="filter" type="text" placeholder="Search">
                    <div class="selectdiv">
                        <label>
                            Choose one:
                            <select name = "typeFood">
                                <option selected>None</option>
                                 <#list tf as t>
                                <option value="${t}">${t}</option>
                                </#list>
                             </select>
                        </label>
                    </div>
                <div class="selectdiv">
                    <label>
                        Choose one:
                        <select name="typeRecipe">
                            <option selected>None</option>
                            <#list tr as t>
                             <option value="${t}">${t}</option>
                            </#list>
                         </select>
                    </label>
                </div>
                <button type="submit" class="default-btn">Search</button>
            </form>
        </div>
        <p id="result"><#if result??>${result}</p></#if>
        <div class="items">
            <#list resps as rp>
            <div class="item__inner">
                <div class="item__image">
                    <img src="../${rp.imgPath}" alt="TestFind">
                </div>
                <div class="item__describe">
                    <p id="cardName">${rp.nameRecipe}</p>
                    <p>${rp.describe}
                    </p>
                </div>
                <div class="item__rating">
                    <p>Rate: ${rp.rating}</p>
                </div>
                <div class="item__more">
                    <a href="/CookBook_war/recipes/getOneRecept/${rp.id}" class="default-btn">More</a>
                </div>
            </div>
            </#list>
        </div>
    </div>
</section>

<footer class="footer">
    <div class="container">
        <div class="footer__top">
            <div class="footer_top-title">
                Follow us to instagram
            </div>
        </div>
        <div class="footer__top-images">
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../img/insta1.jpg" alt="insta1" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../img/insta2.jpg" alt="insta2" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../img/insta3.jpg" alt="insta3" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../img/insta4.jpg" alt="insta4" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../img/insta5.jpg" alt="insta5" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../img/insta6.jpg" alt="insta6" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
        </div>
        <div class="footer__contact">
            <a href="#" id="facebook" class="header__links"></a>
            <a href="#" id="twitter" class="header__links"></a>
            <a href="#" id="pinterest" class="header__links"></a>
            <a href="#" id="linkedIn" class="header__links"></a>
            <a href="#" id="mail" class="header__links"></a>
        </div>
        <div class="footer__logo">
            <img src="../img/logos.png" width="200" height="100" alt="logo">
        </div>
    </div>
</footer>

<div id="toTop" class="toTop">^</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="../js/slick.min.js"></script>
<script src="../js/jquery.animateNumber.min.js"></script>
<script src="../js/jquery.rateyo.min.js"></script>
<script src="../js/multiple-select.min.js"></script>
<script src="../js/main.js"></script>
</body>

</html>