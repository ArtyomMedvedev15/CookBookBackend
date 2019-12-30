<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>One recipe</title>
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
    <link rel="stylesheet" href="../../css/media.css">
    <link rel="stylesheet" href="../../css/normalize.css">
    <link rel="stylesheet" href="../../css/fonts.css">
    <link rel="stylesheet" href="../../css/jquery.rateyo.min.css">
    <link rel="stylesheet" href="../../css/slick.css">
    <link rel="stylesheet" href="../../css/style.css"/>
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
                    <a href="#">
                        <img src="../../img/logos.png" alt="logo">
                    </a>
                </div>

                <div class="menu-wrap">
                    <div class="menu-sidebar">
                        <div class="mob__logo">
                            <a href="/CookBook_war/">
                                <img src="../img/logos.png" alt="logo">
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
</header>
<a href="/CookBook_war/recipes/recipies" id="recept" class="default-btn">Back</a>
<section class="recept">
    <div class="container">
        <div class="recept-inner">
            <div class="recept__img">
                <img src="../../${recept.imgPath}" alt="image recept" width="100%" height="400px" srcset="">
            </div>
            <div class="recept-info">
                <div class="text-info">
                    <div class="recept-date">
                        ${recept.getDateCreate()}
                    </div>
                    <div class="recept-name">
                        ${recept.nameRecipe}
                    </div>
                </div>
                <div>
                    <div class="recept-rating">
                        <div class="RatingOneRecept" id="RatingOneRecept" rate="${recept.rating}"></div>
                    </div>
                    <div class="recept-complexlty">
                        <p>comple</p>
                    </div>
                </div>

            </div>

            <div class="recept-times">
                <p>Prep:time</p>
                <p>Cook:tome</p>
                <p>Yelds:counts</p>
            </div>

            <div class="recept-describe">
                <div class="recept-stepbystep">
                    <ol type="01">
                        <li>
                            <p>step</p>
                        </li>
                        <li>
                            <p> step</p>
                        </li>
                    </ol>
                </div>
                <div class="recept-ingredients">
                    <div class="logoIngr">
                        <p>Ingredients:</p>
                    </div>
                    <div class="checks">
                        <label class="containers">He
                            <input type="checkbox" checked="checked">
                            <span class="checkmark"></span>
                        </label>

                        <label class="containers">Two
                            <input type="checkbox">
                            <span class="checkmark"></span>
                        </label>

                        <label class="containers">Three
                            <input type="checkbox">
                            <span class="checkmark"></span>
                        </label>

                        <label class="containers">Four
                            <input type="checkbox">
                            <span class="checkmark"></span>
                        </label>
                    </div>
                </div>
            </div>
        </div>
    </div>
 </section>
<section class="connection__form">

    <div class="connection__form-title">
        Leave comment
    </div>
    <div class="contacts-form">
        <div class="contact-form__inner">
            <form action="" method="post">
                <input id="Name" type="text" placeholder="Name">
                <input id="Email" type="text" placeholder="Email">
                <input id="Subject" type="text" placeholder="Subject">
                <textarea placeholder="Message" name="" id="Message" cols="30" rows="10"></textarea>

                <button class="default-btn" type="submit">Feed</button>
            </form>
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
                    <img width="195" height="195" src="../../img/insta1.jpg" alt="insta1" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../../img/insta2.jpg" alt="insta2" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../../img/insta3.jpg" alt="insta3" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../../img/insta4.jpg" alt="insta4" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../../img/insta5.jpg" alt="insta5" srcset="">
                    <div class="block">
                    </div>
                </div>
            </a>
            <a class="lx" href="www.google.com">
                <div class="insta__foll">
                    <img width="195" height="195" src="../../img/insta6.jpg" alt="insta6" srcset="">
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
            <img src="../../img/logos.png" width="200" height="100" alt="logo">
        </div>
    </div>
</footer>
<div id="toTop" class="toTop">^</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="../../js/slick.min.js"></script>
<script src="../../js/jquery.rateyo.min.js"></script>
<script src="../../js/main.js"></script>
</body>

</html>