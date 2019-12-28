<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/media.css">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/fonts.css">
    <link rel="stylesheet" href="css/jquery.rateyo.min.css">
    <link rel="stylesheet" href="css/slick.css">
    <link rel="stylesheet" href="css/style.css"/>
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
                            <img src="img/logos.png" alt="logo">
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
                                <li><a href="/CookBook_war/">Receipies</a></li>
                                <li><a href="/CookBook_war/">4 Vegans</a></li>
                                <li><a href="/CookBook_war/contact/contactUs">Contact</a></li>
                            </ul>
                        </div>
                    </div>
                    <nav class="menu">
                        <ul>
                            <li><a href="/CookBook_war/">Home</a></li>
                            <li><a href="/CookBook_war/about/aboutUs">About us</a></li>
                            <li><a href="/CookBook_war/">Receipies</a></li>
                            <li><a href="/CookBook_war/">4 Vegans</a></li>
                            <li><a href="/CookBook_war/contact/contactUs">Contact</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </header>

    <section class="slider">
        <div class="container">
            <div class="slider__inner">
                <div id="sl1" class="slider__item">
                    <div class="slider__item-content">
                        <div class="slider__title">
                            Lorem lorem lorem
                        </div>
                        <div class="slider__text">
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Debitis nesciunt, veniam vitae facere sint nam nulla accusantium praesentium, sed aperiam odit. Amet voluptate quidem aspernatur eos sint, nulla rerum quam!
                        </div>
                        <a class="default-btn" href="#">See Receipies</a>
                    </div>
                </div>
                <div id="sl2" class="slider__item">
                    <div class="slider__item-content">
                        <div class="slider__title">
                            Lorem lorem lorem
                        </div>
                        <div class="slider__text">
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Debitis nesciunt, veniam vitae facere sint nam nulla accusantium praesentium, sed aperiam odit. Amet voluptate quidem aspernatur eos sint, nulla rerum quam!
                        </div>
                        <a class="default-btn" href="#">See Receipies</a>
                    </div>
                </div>
                <div id="sl3" class="slider__item">
                    <div class="slider__item-content">
                        <div class="slider__title">
                            Lorem lorem lorem
                        </div>
                        <div class="slider__text">
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Debitis nesciunt, veniam vitae facere sint nam nulla accusantium praesentium, sed aperiam odit. Amet voluptate quidem aspernatur eos sint, nulla rerum quam!
                        </div>
                        <a class="default-btn" href="#">See Receipies</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="example_recipes">
        <div class="container">
            <div class="example_recipes__inner">
                <#list ExampleRecipes1 as emp1 >
                <div id="exprc1" class="recipes__item">
                    <div class="layer"></div>
                        <div class="recipes__title">
                            ${emp1.nameRecipe}
                        </div>
                    <div class="recipes__text">
                        ${emp1.describe}
                     </div>
                    <a href="/" class="default-btn">See Full Receipies</a>
                </div>
                </#list>
                <#list ExampleRecipes2 as emp2 >
                <div id="exprc2" class="recipes__item">
                    <div class="layer"></div>
                    <div class="recipes__title">
                        ${emp2.nameRecipe}
                    </div>
                    <div class="recipes__text">
                        ${emp2.describe}
                     </div>
                    <a href="/" class="default-btn">See Full Receipies</a>
                </div>
                </#list>

            </div>
        </div>
    </section>

    <section class="best__receipes">
        <div class="container">
            <div class="best-resp__section_title">The best recipes</div>
            <div class="best__receipes-inner">

                 <#list BestsRecipes as bst >
                <div class="best__recepies-item">
                    <div class="best__recepies-image">
                        <img src="${bst.imgPath}" alt="bestrecept1" srcset="">
                    </div>
                    <div class="best__recepies-title">
                        <a href="">${bst.nameRecipe}</a>
                    </div>
                    <div class="best__recepies-rating">
                        <div id="rateYo${bst.id}" rate="${bst.rating}"></div>
                    </div>
                </div>
                 </#list>
            </div>
        </div>
    </section>

    <section class="gluten__free">
        <div class="gluten__inner">
            <div class="gluten__tittle">
                Gluten Free Receipies
            </div>
            <div class="gluten__text">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Exercitationem officia optio, atque recusandae assumenda commodi incidunt necessitatibus numquam in nemo saepe temporibus nesciunt voluptatum tenetur impedit, iste mollitia porro distinctio?
            </div>
            <a class="default-btn" href="#">Discover All The Receipies</a>
        </div>
        <div class="container">
            <div class="gluten__inner-receipies">
                <#list Glutens as glt>
                    <div class="gluten__item">
                        <div class="gluten__image"> <img src="${glt.imgPath}" width="80" height="80" alt="sr1" srcset="">
                        </div>

                        <div class="glute__date">
                            ${glt.getDateCreate()}
                        </div>
                        <div class="gluten__title">
                            <a href="#">${glt.nameRecipe}</a>
                        </div>
                        <div class="gluten__rating">
                            <div id="rateYo7" rate = "${glt.rating}"></div>
                        </div>
                        <div class="gluten__comments">
                                Comments:${glt.getCountComment()}
                        </div>
                    </div>
                </#list>
            </div>
        </div>
    </section>

    <section class="feedback__section">
        <div class="container">
            <div class="feedback__inner">
                <div class="feedback__item-quote">
                    <p>"</p>
                    <div class="feedback__item-text">
                        Nothing is better than going home to family and eating good food and relaxing
                    </div>
                    <div class="feedback__item-author">
                        Lorem James
                    </div>
                    <div class="feedback__item-date">
                        Jan,04,2019
                    </div>
                </div>
                <div class="feedback__item-form">
                    <div class="feedback__item-form-title">
                        Subscribe to our news letter
                    </div>
                    <div class="feedback__item-form-inner">
                        <form name="Subscribe" method="post" action="/CookBook_war/addSubscribe">
                            <input type="text" name="email" placeholder="Subscribe to newsletter">
                            <button type="submit" class="default-btn">Subscribe</button>
                        </form>
                        <div class="feedback__item-form-text">
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Sapiente ut illo veniam cum, iure ipsum alias? Corrupti quia quisquam aperiam impedit? Suscipit quo provident laborum, facere nihil nesciunt? Porro, dolor?
                        </div>
                    </div>
                </div>
                <div class="feedback__item-deals">
                    <img src="img/add.png" alt="add" width="350" height="462">
                </div>
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
                        <img width="195" height="195" src="img/insta1.jpg" alt="insta1" srcset="">
                        <div class="block">
                        </div>
                    </div>
                </a>
                <a class="lx" href="www.google.com">
                    <div class="insta__foll">
                        <img width="195" height="195" src="img/insta2.jpg" alt="insta2" srcset="">
                        <div class="block">
                        </div>
                    </div>
                </a>
                <a class="lx" href="www.google.com">
                    <div class="insta__foll">
                        <img width="195" height="195" src="img/insta3.jpg" alt="insta3" srcset="">
                        <div class="block">
                        </div>
                    </div>
                </a>
                <a class="lx" href="www.google.com">
                    <div class="insta__foll">
                        <img width="195" height="195" src="img/insta4.jpg" alt="insta4" srcset="">
                        <div class="block">
                        </div>
                    </div>
                </a>
                <a class="lx" href="www.google.com">
                    <div class="insta__foll">
                        <img width="195" height="195" src="img/insta5.jpg" alt="insta5" srcset="">
                        <div class="block">
                        </div>
                    </div>
                </a>
                <a class="lx" href="www.google.com">
                    <div class="insta__foll">
                        <img width="195" height="195" src="img/insta6.jpg" alt="insta6" srcset="">
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
                <img src="img/logos.png" width="200" height="100" alt="logo">
            </div>
        </div>
    </footer>
    <div id="toTop" class="toTop">^</div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.4/jquery.rateyo.min.js.map"></script>
    <script src="js/slick.min.js"></script>
    <script src="js/jquery.rateyo.min.js"></script>
    <script src="js/main.js"></script>
</body>

</html>