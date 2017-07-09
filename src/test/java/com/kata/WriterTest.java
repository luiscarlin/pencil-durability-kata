package com.kata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class WriterTest {
    @Test
    public void writerShouldWriteTextInPaperWithPencil(){

        Pencil pencil = Mockito.mock(Pencil.class);
        Paper paper = Mockito.mock(Paper.class);

        Writer writer = new Writer();
        writer.write("text", pencil, paper);

        verify(pencil).write("text", paper);
    }
}
