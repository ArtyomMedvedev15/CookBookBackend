$(function() {
    $('.slider__inner').slick({
        autoplay: true,
        /* this is the new line */
        autoplaySpeed: 4000,
        nextArrow: '<button type="button" class="slick-btn slick-next"></button>',
        prevArrow: '<button type="button" class="slick-btn slick-prev"></button>',
        infinite: true

    });

    for (var i = 7; i <= 12; i++) {
        var rating = document.querySelector("#rateYo" + i).getAttribute('rate');
        $("#rateYo" + i).rateYo({
            normalFill: "#A0A0A0",
            starWidth: "15px",
            numStars: 5,
            rating: rating,
            readOnly: true
        });
    }
    $(".gluten__rating").rateYo({
        normalFill: "#A0A0A0",
        starWidth: "15px",
        numStars: 5,
        rating: "80%",
        readOnly: true
    });

    $(window).scroll(function() {

        if ($(this).scrollTop() != 0) {
            $('#toTop').fadeIn();
        } else {
            $('#toTop').fadeOut();
        }
    });

    $('#toTop').click(function() {

        $('body,html').animate({ scrollTop: 0 }, 700);

    });

    var $toggleButton = $('.toggle-button'),
        $menuWrap = $('.menu-wrap'),
        $sidebarArrow = $('.sidebar-menu-arrow');

    // Hamburger button

    $toggleButton.on('click', function() {
        $(this).toggleClass('button-open');
        $menuWrap.toggleClass('menu-show');
    });

    // Sidebar navigation arrows

    $sidebarArrow.click(function() {
        $(this).next().slideToggle(300);
    });

    $('#countReceipt')
        .prop('number', 0)
        .animateNumber({
                number: 100
            },
            1000
        );
    $('#countBurger')
        .prop('number', 0)
        .animateNumber({
                number: 25
            },
            1000
        );

    $('#countMeat')
        .prop('number', 0)
        .animateNumber({
                number: 56
            },
            1000
        );

    $('#countDesert')
        .prop('number', 0)
        .animateNumber({
                number: 44
            },
            1000
        );

var ratingOneRecept = document.querySelector("#RatingOneRecept").getAttribute('rate');

    $('#RatingOneRecept').rateYo({
    normalFill: "#A0A0A0",
    starWidth: "15px",
    numStars: 5,
    rating: ratingOneRecept,
    readOnly: true
});
});