package module2

import module1.Data
import module1.Response

fun doStuff(response: Response) {
    if (response.data != null) {
        println(response.data!!)
    }
}

fun print(data: Data) {
    print(data)
}