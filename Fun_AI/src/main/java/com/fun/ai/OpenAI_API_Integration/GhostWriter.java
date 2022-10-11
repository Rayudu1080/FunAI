package com.fun.ai.OpenAI_API_Integration;

import java.util.*;
import java.util.function.Supplier;
import java.util.ArrayList;
import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.engine.Engine;
import com.theokanning.openai.completion.CompletionChoice;

public class GhostWriter {
    public static void main(String... args) {
        String token = System.getenv("OPENAI_TOKEN");
        OpenAiService service = new OpenAiService(token);
    }
}