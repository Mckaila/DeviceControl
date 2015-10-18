/*
 * Copyright (C) 2013 - 2015 Alexander Martinz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.namelessrom.devicecontrol;

import java.util.HashSet;

/**
 * Created by amartinz on 11.10.15.
 */
public class Constants {
    public static final String ACRA_REPORT_URL = "https://bugs.nameless-rom.org/report";
    public static final String ACRA_REPORT_USER = "device_control_reporter";
    public static final String ACRA_REPORT_PASS = "as91amc892mca10AFaji2c08F";

    public static final String EMAIL = "eviscerationls@gmail.com";

    public static final String GITHUB_BASE_URL = "https://github.com/Evisceration";
    public static final String GITHUB_DC_COMMIT_URL_BASE = GITHUB_BASE_URL + "/DeviceControl/commits/%s";

    public static final String GOOGLE_PLUS_URL = "https://plus.google.com/+AlexanderMartinz";

    public static final String LINKEDIN_URL = "https://at.linkedin.com/pub/alexander-martinz/7a/231/93b";

    public static final String PKG_PLAY_STORE = "com.android.vending";

    public static final String IO_SCHED_CONFIG_DIR = "/sys/block/mmcblk0/queue/iosched/";

    // whitelisted packages have a disabled selector in the app manager
    public static final HashSet<String> APP_MANAGER_PACKAGE_WHITE_LIST = new HashSet<>();

    static {
        APP_MANAGER_PACKAGE_WHITE_LIST.add("org.namelessrom.devicecontrol");
        APP_MANAGER_PACKAGE_WHITE_LIST.add("org.namelessrom.devicecontrol.dev");
        APP_MANAGER_PACKAGE_WHITE_LIST.add("org.namelessrom.devicecontrol.next");
        APP_MANAGER_PACKAGE_WHITE_LIST.add("org.namelessrom.devicecontrol.next.dev");
    }
}
