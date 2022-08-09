package org.owasp.safetypes.types.string.geodata.country;

import org.owasp.safetypes.exception.TypeValidationException;
import org.owasp.safetypes.types.string.AbstractSafeEnumStringIgnoreCase;

import java.util.Set;

public class Country extends AbstractSafeEnumStringIgnoreCase {

    protected Country(String value) throws TypeValidationException {
        super(value);
    }

    @Override
    protected Set<String> setStrings() {
        return Set.of( "AF", "AFG", "AL", "ALB", "DZ", "DZA", "AS", "ASM", "AD", "AND", "AO", "AGO", "AI", "AIA", "AQ",
                "ATA", "AG", "ATG", "AR", "ARG", "AM", "ARM", "AW", "ABW", "AU", "AUS", "AT", "AUT", "AZ", "AZE", "BS",
                "BHS", "BH", "BHR", "BD", "BGD", "BB", "BRB", "BY", "BLR", "BE", "BEL", "BZ", "BLZ", "BJ", "BEN", "BM",
                "BMU", "BT", "BTN", "BO", "BOL", "BA", "BIH", "BW", "BWA", "BR", "BRA", "IO", "IOT", "VG", "VGB", "BN",
                "BRN", "BG", "BGR", "BF", "BFA", "BI", "BDI", "KH", "KHM", "CM", "CMR", "CA", "CAN", "CV", "CPV", "KY",
                "CYM", "CF", "CAF", "TD", "TCD", "CL", "CHL", "CN", "CHN", "CX", "CXR", "CC", "CCK", "CO", "COL", "KM",
                "COM", "CK", "COK", "CR", "CRI", "HR", "HRV", "CU", "CUB", "CW", "CUW", "CY", "CYP", "CZ", "CZE", "CD",
                "COD", "DK", "DNK", "DJ", "DJI", "DM", "DMA", "DO", "DOM", "TL", "TLS", "EC", "ECU", "EG", "EGY", "SV",
                "SLV", "GQ", "GNQ", "ER", "ERI", "EE", "EST", "ET", "ETH", "FK", "FLK", "FO", "FRO", "FJ", "FJI", "FI",
                "FIN", "FR", "FRA", "PF", "PYF", "GA", "GAB", "GM", "GMB", "GE", "GEO", "DE", "DEU", "GH", "GHA", "GI",
                "GIB", "GR", "GRC", "GL", "GRL", "GD", "GRD", "GU", "GUM", "GT", "GTM", "GG", "GGY", "GN", "GIN", "GW",
                "GNB", "GY", "GUY", "HT", "HTI", "HN", "HND", "HK", "HKG", "HU", "HUN", "IS", "ISL", "IN", "IND", "ID",
                "IDN", "IR", "IRN", "IQ", "IRQ", "IE", "IRL", "IM", "IMN", "IL", "ISR", "IT", "ITA", "CI", "CIV", "JM",
                "JAM", "JP", "JPN", "JE", "JEY", "JO", "JOR", "KZ", "KAZ", "KE", "KEN", "KI", "KIR", "XK", "XKX", "KW",
                "KWT", "KG", "KGZ", "LA", "LAO", "LV", "LVA", "LB", "LBN", "LS", "LSO", "LR", "LBR", "LY", "LBY", "LI",
                "LIE", "LT", "LTU", "LU", "LUX", "MO", "MAC", "MK", "MKD", "MG", "MDG", "MW", "MWI", "MY", "MYS", "MV",
                "MDV", "ML", "MLI", "MT", "MLT", "MH", "MHL", "MR", "MRT", "MU", "MUS", "YT", "MYT", "MX", "MEX", "FM",
                "FSM", "MD", "MDA", "MC", "MCO", "MN", "MNG", "ME", "MNE", "MS", "MSR", "MA", "MAR", "MZ", "MOZ", "MM",
                "MMR", "NA", "NAM", "NR", "NRU", "NP", "NPL", "NL", "NLD", "AN", "ANT", "NC", "NCL", "NZ", "NZL", "NI",
                "NIC", "NE", "NER", "NG", "NGA", "NU", "NIU", "KP", "PRK", "MP", "MNP", "NO", "NOR", "OM", "OMN", "PK",
                "PAK", "PW", "PLW", "PS", "PSE", "PA", "PAN", "PG", "PNG", "PY", "PRY", "PE", "PER", "PH", "PHL", "PN",
                "PCN", "PL", "POL", "PT", "PRT", "PR", "PRI", "QA", "QAT", "CG", "COG", "RE", "REU", "RO", "ROU", "RU",
                "RUS", "RW", "RWA", "BL", "BLM", "SH", "SHN", "KN", "KNA", "LC", "LCA", "MF", "MAF", "PM", "SPM", "VC",
                "VCT", "WS", "WSM", "SM", "SMR", "ST", "STP", "SA", "SAU", "SN", "SEN", "RS", "SRB", "SC", "SYC", "SL",
                "SLE", "SG", "SGP", "SX", "SXM", "SK", "SVK", "SI", "SVN", "SB", "SLB", "SO", "SOM", "ZA", "ZAF", "KR",
                "KOR", "SS", "SSD", "ES", "ESP", "LK", "LKA", "SD", "SDN", "SR", "SUR", "SJ", "SJM", "SZ", "SWZ", "SE",
                "SWE", "CH", "CHE", "SY", "SYR", "TW", "TWN", "TJ", "TJK", "TZ", "TZA", "TH", "THA", "TG", "TGO", "TK",
                "TKL", "TO", "TON", "TT", "TTO", "TN", "TUN", "TR", "TUR", "TM", "TKM", "TC", "TCA", "TV", "TUV", "VI",
                "VIR", "UG", "UGA", "UA", "UKR", "AE", "ARE", "GB", "GBR", "US", "USA", "UY", "URY", "UZ", "UZB", "VU",
                "VUT", "VA", "VAT", "VE", "VEN", "VN", "VNM", "WF", "WLF", "EH", "ESH", "YE", "YEM", "ZM", "ZMB", "ZW",
                "ZWE" );
    }
}
