package lessons.lesson30.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ru.stimmax.lessons.lesson30.homework.InventoryManager


class InventoryManagerTest {

    private lateinit var manager: InventoryManager

    @BeforeEach
    fun setUp() {
        manager = InventoryManager(7)
    }

    @Test
    fun `getItemCount should return zero when item does not exist`() {
        assertEquals(0, manager.getItemCount("Sword"))
    }

    @Test
    fun `getItemCount should return correct count for single item`() {
        manager.addItem("Sword", 4)
        assertEquals(4, manager.getItemCount("Sword"))
    }

    @Test
    fun `getItemCount should return correct counts for multiple distinct items`() {
        manager.addItem("Sword", 3)
        manager.addItem("Shield", 2)
        assertEquals(3, manager.getItemCount("Sword"))
        assertEquals(2, manager.getItemCount("Shield"))
    }

    @Test
    fun `addItem should stack quantity when adding same item multiple times`() {
        manager.addItem("Potion", 3)
        manager.addItem("Potion", 3)
        assertEquals(6, manager.getItemCount("Potion"))
    }

    @Test
    fun `addItem should fill inventory exactly to maximum capacity`() {
        manager.addItem("Sword", 4)
        manager.addItem("Shield", 3)
        assertEquals(4, manager.getItemCount("Sword"))
        assertEquals(3, manager.getItemCount("Shield"))
    }

    @Test
    fun `addItem should throw exception when exceeding capacity with single item`() {
        assertThrows(IllegalStateException::class.java) {
            manager.addItem("Potion", 8)
        }
    }

    @Test
    fun `addItem should throw exception when exceeding capacity with multiple items`() {
        manager.addItem("Sword", 5)
        assertThrows(IllegalStateException::class.java) {
            manager.addItem("Shield", 3)
        }
    }

    @Test
    fun `removeItem should return true and decrease amount during partial removal`() {
        manager.addItem("Sword", 6)
        val result = manager.removeItem("Sword", 2)
        assertTrue(result)
        assertEquals(4, manager.getItemCount("Sword"))
    }

    @Test
    fun `removeItem should return true and completely remove item when full quantity removed`() {
        manager.addItem("Shield", 5)
        val result = manager.removeItem("Shield", 5)
        assertTrue(result)
        assertEquals(0, manager.getItemCount("Shield"))
    }

    @Test
    fun `removeItem should return false when trying to remove non-existent item`() {
        val result = manager.removeItem("Helmet", 1)
        assertFalse(result)
    }

    @Test
    fun `removeItem should return false when requested quantity is greater than available`() {
        manager.addItem("Potion", 3)
        val result = manager.removeItem("Potion", 4)
        assertFalse(result)
        assertEquals(3, manager.getItemCount("Potion"))
    }

    @Test
    fun `capacity should be freed up after item is removed`() {
        manager.addItem("Sword", 7)
        manager.removeItem("Sword", 4)

        assertDoesNotThrow {
            manager.addItem("Shield", 3)
        }
        assertEquals(3, manager.getItemCount("Shield"))
    }

    @Test
    fun `removing full item allows adding it again up to capacity`() {
        manager.addItem("Potion", 7)
        manager.removeItem("Potion", 7)

        assertDoesNotThrow {
            manager.addItem("Potion", 6)
        }
        assertEquals(6, manager.getItemCount("Potion"))
    }
}