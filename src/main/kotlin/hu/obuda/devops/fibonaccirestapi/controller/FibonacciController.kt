package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class FibonacciController(
    private val fibonacciService: FibonacciService
) {

    @GetMapping("fibonacci")
    fun fibonacci(@RequestParam n: Int): ResponseEntity<Int> {

        if (n > 46) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build()
        }

        return ResponseEntity.ok(fibonacciService.fibonacci(n))
    }
}
