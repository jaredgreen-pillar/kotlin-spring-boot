package hello

import org.springframework.stereotype.Component

@Component
class HelloService {

    fun greeting() =
            "Hello World!"

}