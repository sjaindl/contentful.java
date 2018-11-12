package com.contentful.java.cda;

import com.contentful.java.cda.lib.Enqueue;
import com.contentful.java.cda.rich.CDARichBlock;
import com.contentful.java.cda.rich.CDARichDocument;
import com.contentful.java.cda.rich.CDARichEmbeddedLink;
import com.contentful.java.cda.rich.CDARichHeading;
import com.contentful.java.cda.rich.CDARichHorizontalRule;
import com.contentful.java.cda.rich.CDARichHyperLink;
import com.contentful.java.cda.rich.CDARichMark.CDARichMarkBold;
import com.contentful.java.cda.rich.CDARichMark.CDARichMarkCode;
import com.contentful.java.cda.rich.CDARichMark.CDARichMarkItalic;
import com.contentful.java.cda.rich.CDARichMark.CDARichMarkUnderline;
import com.contentful.java.cda.rich.CDARichOrderedList;
import com.contentful.java.cda.rich.CDARichParagraph;
import com.contentful.java.cda.rich.CDARichQuote;
import com.contentful.java.cda.rich.CDARichText;
import com.contentful.java.cda.rich.CDARichUnorderedList;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class RichTextTest extends BaseTest {
  @Test
  @Enqueue(value = "rich_text/simple_headline_1.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_headline_1_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichHeading.class);
    final CDARichHeading heading = (CDARichHeading) rich.getContent().get(0);

    assertThat(heading.getLevel()).isEqualTo(1);
    assertThat(heading.getContent()).hasSize(1);
    assertThat(heading.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) heading.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_headline_2.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_headline_2_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichHeading.class);
    final CDARichHeading heading = (CDARichHeading) rich.getContent().get(0);

    assertThat(heading.getLevel()).isEqualTo(2);
    assertThat(heading.getContent()).hasSize(1);
    assertThat(heading.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) heading.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_headline_3.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_headline_3_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichHeading.class);
    final CDARichHeading heading = (CDARichHeading) rich.getContent().get(0);

    assertThat(heading.getLevel()).isEqualTo(3);
    assertThat(heading.getContent()).hasSize(1);
    assertThat(heading.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) heading.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_headline_4.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_headline_4_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichHeading.class);
    final CDARichHeading heading = (CDARichHeading) rich.getContent().get(0);

    assertThat(heading.getLevel()).isEqualTo(4);
    assertThat(heading.getContent()).hasSize(1);
    assertThat(heading.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) heading.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_headline_5.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_headline_5_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichHeading.class);
    final CDARichHeading heading = (CDARichHeading) rich.getContent().get(0);

    assertThat(heading.getLevel()).isEqualTo(5);
    assertThat(heading.getContent()).hasSize(1);
    assertThat(heading.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) heading.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_headline_6.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_headline_6_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichHeading.class);
    final CDARichHeading heading = (CDARichHeading) rich.getContent().get(0);

    assertThat(heading.getLevel()).isEqualTo(6);
    assertThat(heading.getContent()).hasSize(1);
    assertThat(heading.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) heading.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_horizontal_rule.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_horizontal_rule_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichHorizontalRule.class);
  }

  @Test
  @Enqueue(value = "rich_text/simple_ordered_list.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_ordered_list_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichOrderedList.class);

    final CDARichOrderedList list = (CDARichOrderedList) rich.getContent().get(0);
    assertThat(list.getContent()).hasSize(5);

    final CDARichBlock item = (CDARichBlock) list.getContent().get(0);
    assertThat(item.getContent()).hasSize(1);

    final CDARichBlock block = (CDARichBlock) item.getContent().get(0);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);

    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This ");
  }

  @Test
  @Enqueue(value = "rich_text/simple_blockquote.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_quote_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichQuote.class);
    final CDARichQuote quote = (CDARichQuote) rich.getContent().get(0);

    assertThat(quote.getContent()).hasSize(1);
    assertThat(quote.getContent().get(0)).isInstanceOf(CDARichBlock.class);

    final CDARichBlock block = (CDARichBlock) quote.getContent().get(0);
    assertThat(block.getContent()).hasSize(1);

    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple blockquote");
  }

  @Test
  @Enqueue(value = "rich_text/simple_text.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(1);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichBlock.class);
    final CDARichBlock block = (CDARichBlock) rich.getContent().get(0);

    assertThat(block.getContent()).hasSize(1);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_text_bold.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_bold_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(1);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichBlock.class);
    final CDARichBlock block = (CDARichBlock) rich.getContent().get(0);

    assertThat(block.getContent()).hasSize(1);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);

    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getMarks()).hasSize(1);
    assertThat(text.getMarks().get(0)).isInstanceOf(CDARichMarkBold.class);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_text_code.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_code_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(1);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichBlock.class);
    final CDARichBlock block = (CDARichBlock) rich.getContent().get(0);

    assertThat(block.getContent()).hasSize(1);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);

    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getMarks()).hasSize(1);
    assertThat(text.getMarks().get(0)).isInstanceOf(CDARichMarkCode.class);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_text_italic.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_italic_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(1);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichBlock.class);
    final CDARichBlock block = (CDARichBlock) rich.getContent().get(0);

    assertThat(block.getContent()).hasSize(1);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);

    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getMarks()).hasSize(1);
    assertThat(text.getMarks().get(0)).isInstanceOf(CDARichMarkItalic.class);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_text_underline.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_underline_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(1);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichBlock.class);
    final CDARichBlock block = (CDARichBlock) rich.getContent().get(0);

    assertThat(block.getContent()).hasSize(1);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);

    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getMarks()).hasSize(1);
    assertThat(text.getMarks().get(0)).isInstanceOf(CDARichMarkUnderline.class);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_text_mixed_bold_italic_underline_code_all.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_mixed_bold_italic_underline_code_all_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(1);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichBlock.class);
    final CDARichBlock block = (CDARichBlock) rich.getContent().get(0);

    assertThat(block.getContent()).hasSize(9);

    final CDARichText first = (CDARichText) block.getContent().get(0);
    assertThat(first.getText()).isEqualTo("This");
    assertThat(first.getMarks()).hasSize(1);
    assertThat(first.getMarks().get(0)).isInstanceOf(CDARichMarkBold.class);

    final CDARichText second = (CDARichText) block.getContent().get(1);
    assertThat(second.getText()).isEqualTo(" ");
    assertThat(second.getMarks()).hasSize(0);

    final CDARichText third = (CDARichText) block.getContent().get(2);
    assertThat(third.getText()).isEqualTo("is");
    assertThat(third.getMarks()).hasSize(1);
    assertThat(third.getMarks().get(0)).isInstanceOf(CDARichMarkItalic.class);

    final CDARichText fourth = (CDARichText) block.getContent().get(3);
    assertThat(fourth.getText()).isEqualTo(" ");
    assertThat(fourth.getMarks()).hasSize(0);

    final CDARichText fifth = (CDARichText) block.getContent().get(4);
    assertThat(fifth.getText()).isEqualTo("some");
    assertThat(fifth.getMarks()).hasSize(1);
    assertThat(fifth.getMarks().get(0)).isInstanceOf(CDARichMarkUnderline.class);

    final CDARichText sixth = (CDARichText) block.getContent().get(5);
    assertThat(sixth.getText()).isEqualTo(" ");
    assertThat(sixth.getMarks()).hasSize(0);

    final CDARichText senventh = (CDARichText) block.getContent().get(6);
    assertThat(senventh.getText()).isEqualTo("simple");
    assertThat(senventh.getMarks()).hasSize(1);
    assertThat(senventh.getMarks().get(0)).isInstanceOf(CDARichMarkCode.class);

    final CDARichText eights = (CDARichText) block.getContent().get(7);
    assertThat(eights.getText()).isEqualTo(" ");
    assertThat(eights.getMarks()).hasSize(0);

    final CDARichText ninth = (CDARichText) block.getContent().get(8);
    assertThat(ninth.getText()).isEqualTo("text");
    assertThat(ninth.getMarks()).hasSize(4);
    assertThat(ninth.getMarks().get(0)).isInstanceOf(CDARichMarkBold.class);
    assertThat(ninth.getMarks().get(1)).isInstanceOf(CDARichMarkItalic.class);
    assertThat(ninth.getMarks().get(2)).isInstanceOf(CDARichMarkUnderline.class);
    assertThat(ninth.getMarks().get(3)).isInstanceOf(CDARichMarkCode.class);
  }

  @Test
  @Enqueue(value = "rich_text/simple_text_embedded.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_embedded_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichEmbeddedLink.class);
    final CDARichEmbeddedLink embedded = (CDARichEmbeddedLink) rich.getContent().get(0);

    assertThat(embedded.getData()).isInstanceOf(CDAEntry.class);
    final CDAEntry cdaEntry = (CDAEntry) embedded.getData();

    assertThat(cdaEntry.<String>getField("name")).isEqualTo("simple_text");

    assertThat(embedded.getContent().get(0)).isInstanceOf(CDARichText.class);
    final CDARichText text = (CDARichText) embedded.getContent().get(0);
    assertThat(text.getText()).isEqualTo("");
  }

  @Test
  @Enqueue(value = "rich_text/simple_text_with_link.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_text_with_link_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(1);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichBlock.class);
    final CDARichBlock block = (CDARichBlock) rich.getContent().get(0);

    assertThat(block.getContent()).hasSize(3);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);
    assertThat(block.getContent().get(1)).isInstanceOf(CDARichHyperLink.class);
    assertThat(block.getContent().get(2)).isInstanceOf(CDARichText.class);

    final CDARichHyperLink link = (CDARichHyperLink) block.getContent().get(1);
    assertThat(link.getData()).isEqualTo("https://www.contentful.com");
    assertThat(link.getContent().get(0)).isInstanceOf(CDARichText.class);

    final CDARichText text = (CDARichText) link.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This is some simple text");
  }

  @Test
  @Enqueue(value = "rich_text/simple_unordered_list.json", defaults = {"rich_text/locales.json", "rich_text/content_types.json"})
  public void simple_unordered_list_test() {
    final CDAEntry entry = (CDAEntry) client.fetch(CDAEntry.class).all().items().get(0);
    final CDARichDocument rich = entry.getField("rich");
    assertThat(rich).isNotNull();

    assertThat(rich.getContent()).hasSize(2);
    assertThat(rich.getContent().get(0)).isInstanceOf(CDARichUnorderedList.class);

    final CDARichUnorderedList list = (CDARichUnorderedList) rich.getContent().get(0);
    assertThat(list.getDecoration()).isEqualTo("*");
    assertThat(list.getContent()).hasSize(6);

    final CDARichBlock item = (CDARichBlock) list.getContent().get(0);
    assertThat(item.getContent()).hasSize(1);

    final CDARichBlock block = (CDARichBlock) item.getContent().get(0);
    assertThat(block.getContent().get(0)).isInstanceOf(CDARichText.class);

    final CDARichText text = (CDARichText) block.getContent().get(0);
    assertThat(text.getText()).isEqualTo("This");
  }
}