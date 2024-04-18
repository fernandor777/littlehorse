package cmd

import (
	"log"
	"strconv"

	"github.com/littlehorse-enterprises/littlehorse/sdk-go/common"
	"github.com/littlehorse-enterprises/littlehorse/sdk-go/common/model"
	"github.com/spf13/cobra"
)

var putMetricCmd = &cobra.Command{
	Use:   "metric",
	Short: "enable a metric",
	Run: func(cmd *cobra.Command, args []string) {
		if len(args) != 2 {
			log.Fatal("You must provide two argument")
		}
		length, err := strconv.Atoi(args[1])
		if err != nil {
			log.Fatal("Couldn't convert window length to int.")

		}
		common.PrintResp(getGlobalClient(cmd).EnableMetric(
			requestContext(cmd),
			&model.EnableMetricRequest{
				Id: &model.MonitorConfigId {
					Id: args[0],
				},
				WindowLengthMs: int64(length),
			},
		))
	},
}

func init() {
	putCmd.AddCommand(putMetricCmd)
}
