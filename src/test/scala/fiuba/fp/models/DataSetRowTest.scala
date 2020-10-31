package fiuba.fp.models

import java.time.LocalDateTime

import fiuba.fp.FpTpSpec
import fiuba.fp.Run.split

class DataSetRowTest extends FpTpSpec {

    "A DataSetRow" should "represent a row" in {

        val row = DataSetRow(12,LocalDateTime.now(),None,Option(12.3),Some(13.6),89.9,123.45,-1213.0,"D", Some(12),None,None,"TONS",123.34,567.23,1234.5)

        row.id shouldBe 12
    }

    "The split method" should "return an array of strings splitted by a comma" in {

        val str = "a,b,c"

        split(str) shouldBe Array("a","b","c")
    }

}