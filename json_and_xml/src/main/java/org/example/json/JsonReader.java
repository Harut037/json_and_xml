package org.example.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {

    /**
     * Method reading from .json file
     * @param file
     * @return
     * @throws IOException
     */
    public Actor jsonReader(File file) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Actor actor = objectMapper.readValue((file), Actor.class);

        return actor;
    }

    public void jsonWriter() {

    }
}
