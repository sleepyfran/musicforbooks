package io.spaceisstrange.musicforbooks.controllers.dashboard

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/api/dashboard")
class DashboardController {

    @GetMapping("/")
    @ResponseBody
    fun getDashboardBooks(): List<DashboardBookResponse> {
        return listOf(
            DashboardBookResponse(
                "Holly Black",
                "The Wicked King (The Folk of the Air, #2)",
                26032887,
                "https://images.gr-assets.com/books/1520620414l/26032887.jpg"
            ),
            DashboardBookResponse(
                "Leigh Bardugo",
                "King of Scars",
                36307634,
                "https://images.gr-assets.com/books/1525110825l/36307634.jpg"
            ),
            DashboardBookResponse(
                "Greer Hendricks",
                "An Anonymous Girl",
                39863515,
                "https://images.gr-assets.com/books/1524442757l/39863515.jpg"
            ),
            DashboardBookResponse(
                "Roshani Chokshi",
                "The Gilded Wolves",
                39863498,
                "https://images.gr-assets.com/books/1525714353l/39863498.jpg"
            ),
            DashboardBookResponse(
                "Katherine Arden",
                "The Winter of the Witch",
                36621586,
                "https://images.gr-assets.com/books/1517001188l/36621586.jpg"
            ),
            DashboardBookResponse(
                "Sonja Yoerg",
                "True Places",
                39904267,
                "https://images.gr-assets.com/books/1532295349l/39904267.jpg"
            ),
            DashboardBookResponse(
                "Sally Thorne",
                "99 Percent Mine",
                36300625,
                "https://images.gr-assets.com/books/1532485978l/36300625.jpg"
            ),
            DashboardBookResponse(
                "Karen M. McManus",
                "Two Can Keep a Secret",
                38225791,
                "https://images.gr-assets.com/books/1531316524l/38225791.jpg"
            ),
            DashboardBookResponse(
                "Karen Thompson Walker",
                "The Dreamers",
                34409176,
                "https://images.gr-assets.com/books/1533916399l/34409176.jpg"
            ),
            DashboardBookResponse(
                "Julia Kelly",
                "The Light Over London",
                38532224,
                "https://images.gr-assets.com/books/1545495005l/38532224.jpg"
            )
        )
    }
}
