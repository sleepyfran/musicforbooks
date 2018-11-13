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
            DashboardBookResponse("Haruki Murakami", "Killing Commendatore", 38820047),
            DashboardBookResponse("John Grisham", "The Reckoning", 38389488),
            DashboardBookResponse("Becky Albertalli", "What If It's Us", 36341204),
            DashboardBookResponse("Kiese Laymon", "Heavy: An American Memoir", 29430746),
            DashboardBookResponse("Susan Orlean", "The Library Book", 39507318)
        )
    }
}