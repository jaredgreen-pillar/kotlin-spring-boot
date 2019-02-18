package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(val helloService: HelloService) {

    @GetMapping("/")
    fun helloKotlinService(): String {
        return helloService.greeting()
    }

}
