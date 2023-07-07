package Lesson_08.Lesson_08_05.Interface;

import Lesson_08.Lesson_08_05.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
