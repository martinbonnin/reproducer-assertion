package module2

import module1.Data
import module1.Response

fun doStuff(response: Response) {
    if (response.data != null) {
        doSomethingWithNonNullable(response.data!!)
    }
}

fun doSomethingWithNonNullable(data: Data) {
    print(data)
}