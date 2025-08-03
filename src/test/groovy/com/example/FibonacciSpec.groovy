import spock.lang.Specification

class FibonacciSpec extends Specification {

    def "fibonacci of 0 should be 0"() {
        expect:
        Fibonacci.fibonacci(0) == 0
    }

    def "fibonacci of 1 should be 1"() {
        expect:
        Fibonacci.fibonacci(1) == 1
    }

    def "fibonacci of 2 should be 1"() {
        expect:
        Fibonacci.fibonacci(2) == 1
    }

    def "fibonacci of 3 should be 2"() {
        expect:
        Fibonacci.fibonacci(3) == 2
    }

    def "fibonacci of 4 should be 3"() {
        expect:
        Fibonacci.fibonacci(4) == 3
    }

    def "fibonacci of 5 should be 5"() {
        expect:
        Fibonacci.fibonacci(5) == 5
    }

    def "fibonacci of 6 should be 8"() {
        expect:
        Fibonacci.fibonacci(6) == 8
    }

    def "negative input should throw IllegalArgumentException"() {
        when:
        Fibonacci.fibonacci(-1)

        then:
        thrown(IllegalArgumentException)
    }
}
