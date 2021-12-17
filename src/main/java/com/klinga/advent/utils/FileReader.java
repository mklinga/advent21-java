package com.klinga.advent.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {
    public static List<String> readFileAsLines(String fileName) throws IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try (InputStream resource = classloader.getResourceAsStream(fileName)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(resource, StandardCharsets.UTF_8));
            return br.lines().collect(Collectors.toList());
        } catch (Exception e) {
            throw new IOException("Error reading the file " + fileName);
        }
    }
}
