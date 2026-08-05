package lessons.lesson31.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import ru.stimmax.lessons.lesson31.homework.PhoneNumberFormatter

class PhoneNumberFormatterTest {
    private val formatter = PhoneNumberFormatter()

    @ParameterizedTest(name = "[{index}] input=\"{0}\", expected=\"{1}\"")
    @MethodSource("provideValidPhoneNumbers")
    fun `should correctly format valid russian phone numbers`(input: String, expectedFormat: String) {
        val result = formatter.formatPhoneNumber(input)
        assertEquals(expectedFormat, result)
    }

    @ParameterizedTest(name = "[{index}] invalidInput=\"{0}\"")
    @ValueSource(strings = [
        "12345",
        "+1 (922) 941-11-11",
        "892294111",
        "99229411111"
    ])
    fun `should throw exception for invalid phone numbers`(invalidInput: String) {
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(invalidInput)
        }
    }

    companion object {
        @JvmStatic
        fun provideValidPhoneNumbers() = listOf(
            Arguments.of("8 (922) 941-11-11", "+7 (922) 941-11-11"),
            Arguments.of("79229411111", "+7 (922) 941-11-11"),
            Arguments.of("+7 922 941 11 11", "+7 (922) 941-11-11"),
            Arguments.of("9229411111", "+7 (922) 941-11-11"),
            Arguments.of("abc +7 922 941 11 11", "+7 (922) 941-11-11")
        )
    }
}