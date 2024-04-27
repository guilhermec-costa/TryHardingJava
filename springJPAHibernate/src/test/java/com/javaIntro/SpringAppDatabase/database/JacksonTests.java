
import static com.javaIntro.SpringAppDatabase.database.TestDataUtil.createTestAuthorA;
/**
 * JacksonTests
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaIntro.SpringAppDatabase.database.domain.Author;

public class JacksonTests {

    private static Logger logger = Logger.getLogger(JacksonTests.class.getName());

    @Test
    public void testThatObjectMapperCanCreateJsonFromJavaObject() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Author author = createTestAuthorA();
        String jsonString = objectMapper.writeValueAsString(author);
        logger.info("\u001B[32m" + jsonString + "\u001B[0m");
    }
}
