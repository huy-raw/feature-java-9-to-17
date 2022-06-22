package org.example.text_blocks;

import org.junit.jupiter.api.Test;

public class TextBlocks {

    @Test
    public void textBlock() {
        String json = """
                [
                    {
                        "name": "Mizuka",
                        "age": 33
                    },
                    {
                        "name": "Mikami",
                        "age": 31
                    },
                ]
                """;

        System.out.println(json);

    }
}
