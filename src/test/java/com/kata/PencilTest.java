package com.kata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class PencilTest {
    @Test
    public void pencilShouldWriteTextToPaper() {
        Paper paper = Mockito.mock(Paper.class);

        Pencil pencil = new Pencil();
        pencil.write("text", paper);

        verify(paper).add("text");
    }
}
