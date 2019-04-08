package practice.leecode.BinarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search() {

        int[] nums = {-998,-997,-995,-994,-991,-986,-984,-982,-981,-980,-978,-975,-973,-972,-970,-968,-967,-966,-962,-961,-960,-959,-958,-954,-953,-952,-950,-947,-946,-945,-944,-943,-942,-941,-939,-937,-936,-934,-931,-929,-928,-925,-924,-923,-922,-921,-918,-917,-916,-914,-912,-910,-909,-908,-905,-900,-897,-896,-895,-894,-893,-892,-891,-886,-882,-881,-880,-879,-878,-876,-873,-872,-871,-870,-864,-863,-860,-859,-857,-856,-853,-852,-851,-846,-844,-843,-841,-840,-835,-831,-829,-825,-822,-820,-819,-817,-815,-814,-812,-810,-808,-807,-804,-801,-800,-798,-797,-794,-793,-792,-790,-787,-786,-785,-782,-781,-778,-777,-776,-773,-772,-770,-767,-766,-763,-762,-759,-757,-751,-750,-748,-744,-743,-741,-740,-738,-737,-736,-733,-729,-727,-726,-725,-724,-723,-720,-718,-716,-715,-714,-710,-709,-703,-702,-701,-699,-698,-695,-694,-693,-690,-688,-686,-685,-682,-681,-680,-678,-674,-673,-672,-670,-668,-667,-666,-661,-657,-656,-655,-653,-651,-650,-646,-645,-644,-643,-642,-636,-635,-634,-633,-632,-631,-630,-629,-627,-626,-625,-624,-623,-622,-621,-618,-617,-616,-615,-614,-608,-606,-605,-603,-602,-597,-596,-595,-594,-590,-589,-581,-576,-574,-572,-568,-566,-565,-562,-557,-555,-554,-552,-551,-549,-547,-545,-544,-543,-537,-536,-533,-532,-530,-529,-526,-524,-517,-516,-515,-514,-513,-511,-509,-508,-502,-500,-498,-497,-493,-492,-491,-490,-487,-486,-485,-483,-479,-477,-476,-474,-472,-471,-469,-468,-465,-464,-463,-458,-457,-455,-453,-449,-444,-443,-442,-437,-433,-430,-429,-427,-426,-421,-419,-416,-415,-414,-413,-411,-409,-408,-406,-405,-404,-403,-402,-400,-398,-397,-393,-392,-389,-388,-387,-379,-376,-372,-370,-369,-367,-366,-364,-363,-361,-360,-359,-358,-357,-356,-351,-349,-348,-343,-339,-338,-334,-332,-330,-326,-323,-322,-321,-318,-315,-314,-313,-305,-304,-303,-302,-296,-295,-294,-293,-292,-291,-290,-289,-287,-286,-284,-282,-281,-279,-276,-274,-273,-272,-270,-268,-267,-266,-265,-264,-263,-261,-258,-257,-256,-255,-253,-252,-249,-245,-244,-241,-240,-239,-238,-237,-236,-235,-234,-233,-231,-230,-228,-224,-222,-221,-220,-219,-218,-217,-215,-212,-210,-209,-206,-204,-202,-201,-200,-199,-190,-184,-181,-178,-175,-174,-173,-171,-164,-163,-162,-159,-158,-157,-156,-150,-147,-145,-144,-141,-140,-138,-137,-136,-133,-131,-130,-128,-127,-125,-124,-122,-119,-118,-117,-116,-114,-113,-112,-111,-110,-107,-106,-103,-102,-99,-98,-94,-91,-88,-86,-85,-84,-80,-79,-78,-77,-76,-71,-70,-69,-67,-63,-62,-61,-59,-58,-57,-56,-53,-49,-48,-44,-43,-40,-35,-34,-32,-31,-30,-25,-21,-19,-17,-15,-11,-10,-9,-8,-5,-2,8,9,10,12,13,15,19,22,23,25,27,28,29,30,34,35,38,42,43,44,45,49,52,53,54,55,56,58,59,61,62,63,68,73,74,76,77,78,84,85,86,87,88,90,91,92,94,95,97,101,104,105,106,113,114,116,118,119,122,124,125,127,129,132,138,140,143,145,146,147,151,153,158,159,160,161,162,163,164,167,168,169,172,176,179,182,184,185,186,188,189,192,193,196,197,198,201,202,204,207,210,219,220,221,222,225,232,234,235,236,237,240,241,243,244,245,246,247,248,250,254,256,257,258,259,260,261,262,263,265,268,270,274,275,276,277,278,282,286,287,292,293,295,296,298,302,303,304,305,306,307,308,312,314,315,316,317,319,320,324,325,326,328,330,331,332,333,334,335,337,338,339,341,342,343,344,345,350,351,353,355,357,360,362,365,367,369,370,371,373,375,376,378,379,380,383,384,385,389,390,391,397,399,400,401,405,407,410,412,414,416,418,420,421,422,427,428,431,433,435,436,438,439,444,445,446,448,449,452,453,455,456,459,461,462,463,464,465,466,469,473,474,476,477,478,479,481,484,486,490,491,494,497,498,500,501,502,503,512,513,519,520,522,523,525,526,528,529,530,532,536,539,540,542,544,546,550,554,559,562,568,569,570,572,573,574,575,576,579,583,587,590,592,593,595,596,598,601,604,606,607,608,613,614,615,618,619,622,624,626,628,632,633,634,635,639,641,642,644,648,649,656,657,659,660,661,664,665,666,667,670,673,674,676,678,682,685,689,692,697,698,700,701,702,704,707,711,714,716,717,718,722,723,725,726,728,729,732,733,734,735,739,745,747,754,755,756,757,758,759,760,761,762,763,764,766,767,769,774,775,778,780,782,783,786,787,790,791,792,793,795,796,797,798,799,800,804,806,807,808,809,813,814,817,819,822,823,824,826,830,831,832,833,836,838,840,841,844,845,846,849,852,854,859,860,862,864,865,866,868,870,871,872,873,876,877,884,890,891,892,894,896,898,899,900,901,903,910,911,912,916,917,919,920,924,925,926,930,934,935,939,940,941,942,943,945,947,948,952,953,954,955,956,957,958,960,961,965,967,969,970,971,972,975,977,978,979,980,981,982,986,987,988,990,992,994,995,997};

        BinarySearch binarySearch = new BinarySearch();
        assertEquals(988, nums[binarySearch.search(nums, 988)]);
        assertEquals(1, binarySearch.search(new int[]{2,5}, 5));
    }
}