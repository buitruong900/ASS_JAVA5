<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<style>
    * {
        padding: 0;
        margin: 0;
    }

    ul {
        list-style: none;
    }

    .container {
        margin: 0px auto;
        max-width: 100%;
    }

    body {
        font-family: sans-serif;
        color: #fff;
        background-color: beige;
    }

    header {
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        border-bottom: 1px solid #f5f5f5;
        padding: 10px 0px;
    }

    .inner-header {
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    #logo {
        color: black;
        text-transform: uppercase;
        font-size: 1.5rem;
        letter-spacing: 2px;
        text-decoration: none;
    }

    ul#main-menu {
        display: flex;
    }

    ul#main-menu a {
        text-transform: uppercase;
        padding: 10px 20px;
        color: black;
        display: block;
        text-decoration: none;
    }

    #banner {
        background: url("/view/layout/slide-06.jpg");
        min-height: 480px;
        width: 100%;
    }

    #content h1 {
        padding: 30px 0px;
        color: black;
    }

    #content p {
        color: black;
        margin-bottom: 1.2rem;
    }

    footer {
        background-color: #777;
        padding: 10px;
        text-align: center;
        color: white;
        height: 20px;
    }
</style>
<body>
<div id="wrapper" class="container">
    <header>
        <div class="inner-header">
            <a href="/hien-thi" id="logo">Home</a>
            <nav>
                <ul id="main-menu">
                    <li><a href="/san-pham/hien-thi">San Pham</a></li>
                    <li><a href="/cua-hang/hien-thi">Cua Hang</a></li>
                    <li><a href="/nhan-vien/hien-thi">Nhan Vien</a></li>
                    <li><a href="/khach-hang/hien-thi">Khach Hang</a></li>
                    <li><a href="/gio-hang/hien-thi">Gio Hang</a></li>
                    <li><a href="/chuc-vu/hien-thi">Chuc Vu</a></li>
                    <li><a href="/dong-sp/hien-thi">Dong SP</a></li>
                    <li><a href="/mau-sac/hien-thi">Mau Sac</a></li>
                    <li><a href="/nxs/hien-thi">NXS</a></li>
                    <li><a href="/hoa-don/hien-thi">Hoa Don</a></li>
                    <li><a href="/chi-tiet-san-pham/hien-thi">Chi Tiet San Pham</a></li>
                </ul>
            </nav>
        </div>
    </header>
    <div id="banner">
    </div>
    <div id="content">
        <h1>Trang Chu</h1>
        <p>
            Lunar New Year Festival often falls between late January and early February; it is among the most important
            holidays in Vietnam. Officially, the festival includes the 1st, 2nd, and 3rd day in Lunar Calendar; however,
            Vietnamese
            people often spend nearly a month celebrating this special event. Tet Holiday gets its beginning marked with
            the first
            day in the Lunar Year; however, its preparation starts long before that. The 23rd day of the last Lunar
            month is East
            Day—a ritual worshiping Kitchen Gods (Tao Cong). It thought that each year on this day, these Gods go to
            heaven to tell
            Jade Emperor about all activities of households on earth. On New Year’s Eve, they return home to continue
            their duties
            as taking care of families. On New Year’s Day, the first ones who come to visit households—called
            first-foot—are very
            important and hence need to be well chosen, as they believed to hold in their hands the entire luck of the
            family in New
            Year (Tan Nien). After that, till the third day or even the fourth day of Tet, individuals meet relatives,
            friends,
            and colleagues, wishing them all kinds of good things like happiness, health, and success.
        </p>
    </div>
</div>
<footer class="footer mt-auto py-3 bg-light">
    <div class="container text-center">
        <span class="text-muted">© 2023 Your Website. All rights reserved.</span>
    </div>
</footer>
</body>
</html>

