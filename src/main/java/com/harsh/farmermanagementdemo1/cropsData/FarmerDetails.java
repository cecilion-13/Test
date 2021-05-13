package com.harsh.farmermanagementdemo1.cropsData;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FarmerDetails {
    private String name;
    private String contactNumber;
    private String email;
    private String address;
}
