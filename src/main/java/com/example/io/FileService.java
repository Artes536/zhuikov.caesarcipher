package com.example.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {
    public String readFile(Path path){
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = bufferedReader.readLine())!=null){
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
    public void writeFile(Path path, String text){
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
