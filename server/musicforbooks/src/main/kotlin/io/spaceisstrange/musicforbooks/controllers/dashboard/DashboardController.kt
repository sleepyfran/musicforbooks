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
                "Haruki Murakami",
                "Killing Commendatore",
                38820047,
                "https://images.gr-assets.com/books/1527854255m/38820047.jpg"
            ),
            DashboardBookResponse(
                "John Grisham",
                "The Reckoning",
                38389488,
                "https://images.gr-assets.com/books/1524516474m/39072220.jpg"
            ),
            DashboardBookResponse(
                "Becky Albertalli",
                "What If It's Us",
                36341204,
                "https://images.gr-assets.com/books/1526557760m/36341204.jpg"
            ),
            DashboardBookResponse(
                "Kiese Laymon",
                "Heavy: An American Memoir",
                29430746,
                "https://images.gr-assets.com/books/1517524042m/29430746.jpg"
            ),
            DashboardBookResponse(
                "Susan Orlean",
                "The Library Book",
                39507318,
                "https://images.gr-assets.com/books/1524238338m/39507318.jpg"
            )
        )
    }
}